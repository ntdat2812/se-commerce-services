package server

import (
	"google.golang.org/grpc"
)

type GRPCServer struct {
	port       int
	host       string
	grpcServer *grpc.Server
}

func (g *GRPCServer) Serve() error {
	panic("not implemented") // TODO: Implement
}

func (g *GRPCServer) Stop() error {
	panic("not implemented") // TODO: Implement
}
