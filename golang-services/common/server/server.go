package server

import (
	"fmt"
	"log"

	"golang-services/common/infra/consul"

	"github.com/gofiber/fiber/v2"
	"github.com/google/uuid"
)

type SeServer interface {
	Serve() error
	Stop() error
}

type Config struct {
	Port        int
	Host        string
	ServiceName string
	ConsulAddr  string
	WebApp      *fiber.App
}

func New(config Config) SeServer {

	Setup(config)

	return &WebServer{
		port:      config.Port,
		serviceId: fmt.Sprintf("%s-%s", config.ServiceName, uuid.New().String()),
		app:       config.WebApp,
	}
}

func Setup(config Config) {
	// init consul
	err := consul.InitConsulClient(config.ConsulAddr)
	if err != nil {
		log.Fatalf("error when initializing consul client: %s", err)
	}
}
