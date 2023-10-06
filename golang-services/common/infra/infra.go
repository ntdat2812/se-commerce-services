package infra

import (
	"log"

	"golang-services/common/infra/consul"
)

type InfraConfig struct {
	ConsulAddr string
}

func SetUp(config InfraConfig) {

	// init consul
	err := consul.InitConsulClient(config.ConsulAddr)
	if err != nil {
		log.Fatalf("error when initializing consul client: %s", err)
	}

}
