package handler

import (
	"golang-services/account-service/dto"
	"golang-services/account-service/repository"
	"golang-services/common/infra/log"
	"golang-services/common/web/response"
	pagination "golang-services/common/dto"


	"github.com/gofiber/fiber/v2"
)

func List(c *fiber.Ctx) error {

	filterDTO := extractQuery(c)

	accounts, err := repository.ListAccounts(c.Context(), filterDTO)
	if err != nil {
		log.Logger.Errorf("error when get all accounts: %v", err)
		return c.JSON(response.InternalErrorResponse())
	}

	res := response.SuccessfulResponse()
	res.SetResult(accounts)
	res.SetPagination(filterDTO.Page, filterDTO.Limit)

	return c.JSON(res)
}

func extractQuery(c *fiber.Ctx) dto.FilterDTO {
	search := c.Query("search")
	userName := c.Query("user_name")
	limit := c.QueryInt("limit")
	page := c.QueryInt("page", 1)

	return dto.FilterDTO{
		Search:   search,
		UserName: userName,
		PaginationDTO: pagination.PaginationDTO{
			Page: int64(page),
			Limit: int64(limit),
		},
	}

}
