package dto

import (
	"golang-services/account-service/model"
	"golang-services/common/constant"
	m "golang-services/common/model"
)

type RegisterDTO struct {
	UserName string `json:"user_name"`
	Password string `json:"password"`
	Email    string `json:"email"`
	Name     string `json:"name"`
	Gender   string `json:"gender"`
	Status   string `json:"status"`
}

func BuildRegisterAccountModel(dto *RegisterDTO) *model.Account {
	return &model.Account{
		UserName: dto.UserName,
		Password: dto.Password,
		Email:    dto.Email,
		Name:     dto.Name,
		Gender:   dto.Gender,
		Status:   constant.ActiveStatus,
		Base:     m.NewBase(),
	}
}
