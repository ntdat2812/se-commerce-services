package repository

import (
	"context"

	"golang-services/account-service/dto"
	"golang-services/account-service/model"

	"golang-services/common/constant"
	"golang-services/common/infra/db"
	pagination "golang-services/common/dto"

	"go.mongodb.org/mongo-driver/mongo"
)

func accountCol() *mongo.Collection {
	return db.GetCollection(constant.AccountCollection)
}

func CreateAccount(ctx context.Context, account *model.Account) error {
	_, err := accountCol().InsertOne(ctx, account)
	if err != nil {
		return err
	}

	return nil
}


func ListAccounts(ctx context.Context, f dto.FilterDTO) ([]model.Account, error) {
	var accounts []model.Account

	cursor, err := accountCol().Find(ctx, dto.BuildFilter(f), pagination.BuildPaginationOptions(f.PaginationDTO))
	if err != nil {
		return nil, err
	}
	defer cursor.Close(ctx)

	if err := cursor.All(ctx, &accounts); err != nil {
		return accounts, err
	}

	return accounts, nil
}
