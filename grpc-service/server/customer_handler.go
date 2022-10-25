package server

import (
	"context"
	"grpc-service/proto"
	"log"

	"google.golang.org/protobuf/types/known/wrapperspb"
)


func (s *seGRPCServer) GetCustomers(ctx context.Context, req *proto.GetCustomersReq) (*proto.Customers, error) {

	log.Println("get customers")

	
	customers := []*proto.Customer{
		{FirstName: "a", LastName: "t", Email: "deptrai@gmail.com", Gender: proto.Gender_MALE},
		{FirstName: "b", LastName: "c", Email: "xinhgai@gmail.com", Gender: proto.Gender_FEMALE},
	}

	return &proto.Customers{
		Customers: customers,
	}, nil

}

func (s *seGRPCServer) GetCustomerById(ctx context.Context, in *proto.GetCustomersReq) (*proto.Customer, error) {
	log.Println("get customer by id")
	return &proto.Customer{FirstName: "TEST"}, nil

}


func (s *seGRPCServer) CreateCustomer(ctx context.Context, in *proto.Customer) (*wrapperspb.BoolValue, error) {
	log.Println("create customer")
	return &wrapperspb.BoolValue{Value: true}, nil
}

func (s *seGRPCServer) UpdateCustomer(ctx context.Context, in *proto.UpdateCustomerReq) (*wrapperspb.BoolValue, error) {
	log.Println("update customer")
	return &wrapperspb.BoolValue{Value: true}, nil

}

