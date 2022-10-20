package server

import (
	"fmt"
	"grpc-service/client"
	"grpc-service/proto"
	"log"
	"net"

	"google.golang.org/grpc"
)

const SE_GRPC_SERVICE_NAME = "grpc-service"

// interface
type SeGrpcServer interface {
	Serve() error
	Stop() error
}


// constructor
func NewSeGrpcServer(config Config) SeGrpcServer { 

	// consul client
	consulClient, err := client.NewConsulClient(config.ConsulAddr)
	if err != nil {
		log.Fatalf("error when initializing consul client: %s", err)
	}

	return &seGRPCServer{
		port: config.Port,
		host: config.Host,
		consulClient: consulClient,
	}
}

// config
type Config struct {
	Port int
	Host string
	ConsulAddr string
}

// server
type seGRPCServer struct {
	proto.UnimplementedSeGrpcServiceServer
	port int
	host string
	consulClient client.ConsulClient
	grpcServer *grpc.Server
}


func (s *seGRPCServer) Serve() error {


	if s.port == 0 {
		s.port = 3000
	}

	address := fmt.Sprintf("%s:%d",s.host, s.port)
	listener, err := net.Listen("tcp", address)
	if err != nil {
		return err
	}

	// register to consul agent
	err = s.consulClient.Register(SE_GRPC_SERVICE_NAME, s.port)
	if err != nil {
		return fmt.Errorf(fmt.Sprintf("err when register to consul agent: %v", err))
	}

	log.Printf("Starting segrpc server at %s", address)
	grpcServer := grpc.NewServer()
	proto.RegisterSeGrpcServiceServer(grpcServer, s)
	

	s.grpcServer = grpcServer
	return s.grpcServer.Serve(listener)
}

func (s *seGRPCServer) Stop() error {
	
	err := s.consulClient.DeRegister(SE_GRPC_SERVICE_NAME)
	if err != nil {
		log.Fatalf("error when de-register service from consul agent %v", err)
	}
	
	s.grpcServer.Stop()
	log.Printf("Se grpc server was stopped successfully")
	return nil
}






