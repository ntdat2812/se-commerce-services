package main

import (
	"grpc-service/server"
	"log"
	"os"
	"os/signal"
	"syscall"
)


func main() {

	signChan := make(chan os.Signal, 1)


	server := server.NewSeGrpcServer(server.Config{
		Port: 3300,
		Host: "localhost",
	})

	signal.Notify(signChan, os.Interrupt, syscall.SIGTERM)
	go func() {
		<-signChan
		server.Stop()
	}()

	err := server.Serve()	
	if err != nil {
		log.Fatal(err)
	}
}