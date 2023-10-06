package main

import (
	"log"
	"os"
	"os/signal"
	"syscall"

	"golang-services/common/constant"
	"golang-services/common/server"

	"github.com/gofiber/fiber/v2"
)

func main() {

	signChan := make(chan os.Signal, 1)

	app := fiber.New()

	app.Get("/", func(c *fiber.Ctx) error {
		return c.SendString("Hello hihi")
	})

	server := server.New(server.Config{
		Port:        8083,
		ServiceName: constant.AccountService,
		WebApp:      app,
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
