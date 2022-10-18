package com.secommerce.common.exception;


import com.secommerce.common.response.SeResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(SeException.class)
    public ResponseEntity<SeResponse> handleSeException(SeException e) {
        SeResponse seResponse = new SeResponse(e.getStatus(), e.getMessage());
        return new ResponseEntity<>(seResponse, seResponse.getStatus());
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<SeResponse> handleAllUncaughtException(Exception e) {
        SeResponse seResponse = SeResponse.INTERNAL_SERVER_ERROR.withMessage(e.getMessage());
        return new ResponseEntity<>(seResponse, seResponse.getStatus());
    }
}
