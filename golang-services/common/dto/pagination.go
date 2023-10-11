package dto

import "go.mongodb.org/mongo-driver/mongo/options"

type PaginationDTO struct {
	Page  int64 `json:"page"`
	Limit int64 `json:"limit"`
}

func CalculateSkip(page, limit int64) int64 {
	return (page - 1) * limit
}

func BuildPaginationOptions(p PaginationDTO) *options.FindOptions {

	if p.Limit == 0 {
		p.Limit = 10
	}

	if p.Page == 0 {
		p.Page = 1
	}


	skip := CalculateSkip(p.Page, p.Limit)
	return options.Find().SetLimit(p.Limit).SetSkip(skip)
}