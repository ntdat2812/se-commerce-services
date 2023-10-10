package consul

import (
	"github.com/hashicorp/consul/api"
)

var Client *client

type ConsulClient interface {
	Register(string, int) error
	DeRegister(string) error
}

type client struct {
	consul *api.Client
}

func InitConsulClient(addr string) error {

	if Client != nil {
		return nil
	}

	config := api.DefaultConfig()
	config.Address = addr

	c, err := api.NewClient(config)
	if err != nil {
		return err
	}

	Client = &client{consul: c}
	return nil
}

func (c *client) Register(name string, port int) error {
	reg := &api.AgentServiceRegistration{
		ID:   name,
		Name: name,
		Port: port,
	}

	return c.consul.Agent().ServiceRegister(reg)
}

func (c *client) DeRegister(id string) error {
	return c.consul.Agent().ServiceDeregister(id)
}
