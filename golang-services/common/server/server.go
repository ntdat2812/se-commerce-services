package server

import (
	"fmt"
	"log"

	"github.com/gofiber/fiber/v2"
	"github.com/google/uuid"
)

type ServerType string

const (
	WebServerType  ServerType = "web"
	GrpcServerType ServerType = "grpc"
)

type SeServer interface {
	Serve() error
	Stop() error
}

type Config struct {
	Port        int
	Host        string
	ServiceName string
	WebApp      *fiber.App
}

func New(serverType ServerType, config Config) SeServer {

	var server SeServer

	serviceId := fmt.Sprintf("%s-%s", config.ServiceName, uuid.New().String())

	switch serverType {
	case WebServerType:
		{
			server = &WebServer{
				port:      config.Port,
				serviceId: serviceId,
				app:       config.WebApp,
			}
		}

	case GrpcServerType:
		{
			server = &GRPCServer{serviceId: serviceId}
		}

	default:
		log.Fatalf("server type [%s] is not supported", serverType)
	}

	return server
}
