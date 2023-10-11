package dto

import (
	"golang-services/common/dto"

	"go.mongodb.org/mongo-driver/bson"
)

type FilterDTO struct {
	Search   string `json:"search"`
	UserName string `json:"user_name"`
	Status   string `json:"status" bson:"status"`
	dto.PaginationDTO
}

func BuildFilter(f FilterDTO) bson.M {
	filter := bson.M{}

	var filters []bson.M
	if f.UserName != "" {
		filters = append(filters, bson.M{"user_name": f.UserName})
	}

	if f.Search != "" {
		sFilters := []bson.M{}
		sFilters = append(sFilters, bson.M{"user_name": f.Search})
		sFilters = append(sFilters, bson.M{"email": f.Search})
		sFilters = append(sFilters, bson.M{"name": f.Search})

		searchFilter := bson.M{"$or": sFilters}
		filters = append(filters, searchFilter)
	}

	if len(filters) > 0 {
		filter = bson.M{"$and": filters}
	}

	return filter
}
