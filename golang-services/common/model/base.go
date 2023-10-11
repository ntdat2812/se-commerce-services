package model

import (
	"time"

	"go.mongodb.org/mongo-driver/bson/primitive"
)

type Base struct {
	ID        primitive.ObjectID `json:"id,omitempty" bson:"_id"`
	CreatedAt time.Time          `json:"created_at" bson:"created_at"`
	UpdatedAt time.Time          `json:"updated_at" bson:"updated_at"`
}

func NewBase() Base {
	return Base{
		CreatedAt: time.Now(),
		UpdatedAt: time.Now(),
		ID:        primitive.NewObjectID(),
	}
}
