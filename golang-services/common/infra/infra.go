package infra

import (

	// "golang-services/common/infra/consul"
	"golang-services/common/infra/db"
	"golang-services/common/infra/log"
	"github.com/joho/godotenv"
)

type InfraConfig struct {
	ConsulAddr string
}

func SetUp(config InfraConfig) {

	// load .env file
	if err := godotenv.Load(); err != nil {
		log.Logger.Error("No .env file found")
	}

	// connect to mongo db
	db.InitMongoClient()

	// init consul
	// if err := consul.InitConsulClient(config.ConsulAddr); err != nil {
	// 	log.Logger.Fatalf("error when initializing consul client: %s", err)
	// 	panic(err)
	// }
	


}


func Close() {
	// close mongo db
	db.CloseMongoDB()
}