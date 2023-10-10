package main

import (
	"log"
	"os"
	"os/signal"
	"syscall"

	"github.com/gofiber/fiber/v2"

	"golang-services/account-service/handler"
	"golang-services/common/constant"
	"golang-services/common/infra"
	"golang-services/common/server"
	"golang-services/common/web/healthcheck"
)

func main() {

	// server
	run(generateApp())

}

func generateApp() *fiber.App {

	app := fiber.New()

	api := app.Group("/account-service")

	// health check route
	api.Get("/health", healthcheck.HealthCheck)


	// account group
	accountGr := api.Group("/accounts")
	accountGr.Post("/register", handler.Register)


	return app
}

func run(app *fiber.App) {

	// setup infra
	infra.SetUp(infra.InfraConfig{})

	// run server
	signChan := make(chan os.Signal, 1)

	server := server.New(server.WebServerType, server.Config{
		Port:        8083,
		ServiceName: constant.AccountService,
		WebApp:      app,
	})

	signal.Notify(signChan, os.Interrupt, syscall.SIGTERM)
	go func() {
		<-signChan
		server.Stop()
		infra.Close()
	}()

	err := server.Serve()
	if err != nil {
		log.Fatal(err)
	}
}
