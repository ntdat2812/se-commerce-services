package server

import (
	"context"
	"grpc-service/proto"
	"log"
)

func (s *seGRPCServer) GetAllCustomers(ctx context.Context, req *proto.GetAllCustomersReq) (*proto.Customers, error) {

	log.Println("get all customers")

	
	customers := []*proto.Customer{
		{FirstName: "a", LastName: "t", Email: "deptrai@gmail.com", Gender: proto.Gender_MALE},
		{FirstName: "b", LastName: "c", Email: "xinhgai@gmail.com", Gender: proto.Gender_FEMALE},
	}

	return &proto.Customers{
		Customers: customers,
	}, nil

}