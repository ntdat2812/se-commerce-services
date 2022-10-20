package client

import (
	"github.com/hashicorp/consul/api"
)

type ConsulClient interface {
	Register(string, int) error
	DeRegister(string) error
}

type client struct {
	consul *api.Client
}


func NewConsulClient(addr string) (ConsulClient, error) {
	config := api.DefaultConfig()
	config.Address = addr

	c, err := api.NewClient(config)
	if err != nil {
		return nil, err
	}


	return &client{consul: c}, nil
}



func (c *client) Register(name string, port int) error {
	reg := &api.AgentServiceRegistration{
		ID: name,
		Name: name,
		Port: port,
	}

	return c.consul.Agent().ServiceRegister(reg)
}

func (c *client) DeRegister(id string) error {
	return c.consul.Agent().ServiceDeregister(id)
}