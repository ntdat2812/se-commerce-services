package handler

import (
	"golang-services/account-service/model"
	"golang-services/account-service/repository"

	"github.com/gofiber/fiber/v2"
)

type accountDTO struct {
	UserName string `json:"user_name"`
	Password string `json:"password"`
}

func Register(c *fiber.Ctx) error {

	dto := new(accountDTO)

	if err := c.BodyParser(dto); err != nil {
		return err
	}

	repository.CreateAccount(model.Account{UserName: dto.UserName, Password: dto.Password})

	return c.JSON(fiber.Map{})
}