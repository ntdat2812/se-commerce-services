package main

import (
	"context"
	"grpc-service/proto"
	"log"
	"testing"

	"google.golang.org/grpc"
	"google.golang.org/grpc/credentials/insecure"
)

func initClient() *grpc.ClientConn {
	conn, err := grpc.Dial("localhost:3300", grpc.WithTransportCredentials(insecure.NewCredentials()))
	if err != nil {
		log.Println(err)
		return nil
	}

	return conn
}

func Test_GetAllCustomers(t *testing.T) {

	conn := initClient()
	defer conn.Close()


	stub := proto.NewSeGrpcServiceClient(conn)

	customers, err := stub.GetCustomers(context.Background(), &proto.GetCustomersReq{})
	if err != nil {
		log.Println(err)
		return
	}

	log.Println(customers)
}


func Test_GetCustomerById(t *testing.T) {

	conn := initClient()
	defer conn.Close()


	stub := proto.NewSeGrpcServiceClient(conn)

	log.Println("vao day")
	customer, err := stub.GetCustomerById(context.Background(), &proto.GetCustomersReq{})
	if err != nil {
		log.Println(err)
		return
	}

	log.Println(customer)
}


func Test_CreateCustomer(t *testing.T) {

	conn := initClient()
	defer conn.Close()


	stub := proto.NewSeGrpcServiceClient(conn)

	ok, err := stub.CreateCustomer(context.Background(), &proto.Customer{})
	if err != nil {
		log.Fatal(err)
		return
	}

	log.Println(ok)
}


func Test_UpdateCustomer(t *testing.T) {

	conn := initClient()
	defer conn.Close()


	stub := proto.NewSeGrpcServiceClient(conn)

	ok, err := stub.UpdateCustomer(context.Background(), &proto.UpdateCustomerReq{})
	if err != nil {
		log.Fatal(err)
		return
	}

	log.Println(ok)
}