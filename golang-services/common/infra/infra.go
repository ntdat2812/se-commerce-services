package infra

import (
	"log"

	"golang-services/common/infra/consul"
	"golang-services/common/infra/db"
	"github.com/joho/godotenv"
)

type InfraConfig struct {
	ConsulAddr string
}

func SetUp(config InfraConfig) {

	// load .env file
	if err := godotenv.Load(); err != nil {
		log.Println("No .env file found")
	}

	// connect to mongo db
	db.InitMongoClient()

	// init consul
	if err := consul.InitConsulClient(config.ConsulAddr); err != nil {
		log.Fatalf("error when initializing consul client: %s", err)
	}
	


}


func Close() {
	// close mongo db
	db.CloseMongoDB()
}