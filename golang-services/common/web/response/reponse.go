package response

import "net/http"

type Response struct {
	Status  int    `json:"status,omitempty"`
	Message string `json:"message,omitempty"`
	Result  any    `json:"result,omitempty"`
	Limit   int64  `json:"limit,omitempty"`
	Page    int64  `json:"page,omitempty"`
}

func SuccessfulResponse() *Response {
	return &Response{
		Status:  http.StatusOK,
		Message: "api.success",
	}
}

func InternalErrorResponse() *Response {
	return &Response{
		Status:  http.StatusInternalServerError,
		Message: "api.internal.server.error",
	}
}

func UnauthorizedResponse() *Response {
	return &Response{
		Status:  http.StatusUnauthorized,
		Message: "unauthorized",
	}
}

func BadRequestResponse() *Response {
	return &Response{
		Status:  http.StatusBadRequest,
		Message: "api.bad.request",
	}
}

func FailedValidationResponse() *Response {
	return &Response{
		Status:  http.StatusBadRequest,
		Message: "api.failed.validation",
	}
}

func ResourceNotFoundResponse() *Response {
	return &Response{
		Status:  http.StatusNotFound,
		Message: "api.resource.not.found",
	}
}

func (s *Response) Set(message string, result any) {
	s.Message = message
	s.Result = result
}

func (s *Response) SetResult(result any) {
	s.Result = result
}

func (s *Response) SetMessage(message string) {
	s.Message = message
}

func (s *Response) SetPagination(page, limit int64) {
	s.Page = page
	s.Limit = limit
}
