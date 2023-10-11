package db

import (
	"context"
	
	"os"

	"go.mongodb.org/mongo-driver/mongo"
	"go.mongodb.org/mongo-driver/mongo/options"

	"golang-services/common/constant"
	"golang-services/common/infra/log"
)

var MongoClient *mongo.Client

func InitMongoClient() error {

	uri := os.Getenv("MONGODB_URI")
	if uri == "" {
		log.Logger.Fatal("You must set your 'MONGODB_URI' environment variable. See\n\t https://www.mongodb.com/docs/drivers/go/current/usage-examples/#environment-variable")
	}


	var err error
	MongoClient, err = mongo.Connect(context.TODO(), options.Client().ApplyURI(uri))
	if err != nil {
		panic(err)
	}

	log.Logger.Info("connect to MongoDB successfully")


	return nil
}


func CloseMongoDB() {
	err := MongoClient.Disconnect(context.TODO())
	if err != nil {
		panic(err)
	}
}


func GetDatabase(dbName string) *mongo.Database {
	return MongoClient.Database(dbName)
}

func GetCollection(collection string) *mongo.Collection {
	return GetDatabase(constant.MongoDatabase).Collection(collection)
}