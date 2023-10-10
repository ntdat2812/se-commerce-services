package repository

import (
	"context"

	"golang-services/account-service/model"
	"golang-services/common/constant"
	"golang-services/common/infra/db"
)




func CreateAccount(account model.Account) error {
	_, err := db.GetCollection(constant.AccountCollection).InsertOne(context.TODO(), account)
	if err != nil {
		return err
	}

	return nil
}
