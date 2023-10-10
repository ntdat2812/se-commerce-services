package model

type Account struct {
	UserName string `json:"user_name" bson:"user_name"`
	Password string `json:"password" bson:"password"`
}