package server

import (
	"fmt"
	"log"

	"github.com/gofiber/fiber/v2"
	"golang-services/common/infra/consul"
)

type WebServer struct {
	port        int
	app         *fiber.App
	serviceId   string
}

func (w *WebServer) Serve() error {
	if w.port == 0 {
		w.port = 3000
	}

	address := fmt.Sprintf(":%d", w.port)

	// register to consul agent
	err := consul.Client.Register(w.serviceId, w.port)
	if err != nil {
		return fmt.Errorf(fmt.Sprintf("err when register to consul agent: %v", err))
	}

	log.Printf("Starting web server at %s", address)

	return w.app.Listen(address)
}

func (w *WebServer) Stop() error {
	err := consul.Client.DeRegister(w.serviceId)
	if err != nil {
		log.Fatalf("error when de-register service from consul agent %v", err)
	}

	w.app.Shutdown()
	return nil
}
