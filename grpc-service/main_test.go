package main

import (
	"context"
	"grpc-service/proto"
	"log"
	"testing"

	"google.golang.org/grpc"
	"google.golang.org/grpc/credentials/insecure"
)

func Test_GetAllCustomers(t *testing.T) {

	conn, err := grpc.Dial("localhost:3300", grpc.WithTransportCredentials(insecure.NewCredentials()))
	if err != nil {
		log.Println(err)
		return
	}
	defer conn.Close()


	stub := proto.NewSeGrpcServiceClient(conn)

	customers, err := stub.GetAllCustomers(context.Background(), &proto.GetAllCustomersReq{})
	if err != nil {
		log.Println(err)
		return
	}

	log.Println(customers)
}