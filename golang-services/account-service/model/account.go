package model

import (
	"golang-services/common/model"
)

type Account struct {
	model.Base `bson:",inline"`
	UserName   string `json:"user_name" bson:"user_name"`
	Password   string `json:"password" bson:"password"`
	Email      string `json:"email" bson:"email"`
	Name       string `json:"name" bson:"name"`
	Gender     string `json:"gender" bson:"gender"`
	Status     string `json:"status" bson:"status"`
}
