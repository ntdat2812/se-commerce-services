package handler

import (
	"golang-services/account-service/dto"
	"golang-services/account-service/repository"
	"golang-services/common/infra/log"
	"golang-services/common/web/response"

	"github.com/gofiber/fiber/v2"
)

func Register(c *fiber.Ctx) error {

	// parse request
	req := new(dto.RegisterDTO)
	if err := c.BodyParser(req); err != nil {
		return c.JSON(response.BadRequestResponse())
	}

	err := repository.CreateAccount(c.Context(), dto.BuildRegisterAccountModel(req))
	if err != nil {
		log.Logger.Error(err)
		return c.JSON(response.InternalErrorResponse())
	}

	return c.JSON(response.SuccessfulResponse())
}
