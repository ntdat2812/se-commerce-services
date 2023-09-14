package com.secommerce.common.exception;


import com.secommerce.common.response.SeResponse;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.ArrayList;
import java.util.List;

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


    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {

        List<String> errors = new ArrayList<>();
        ex.getAllErrors().forEach(err -> errors.add(err.getDefaultMessage()));
        SeResponse seResponse = SeResponse.FAILED_VALIDATION.withResult(errors);
        return new ResponseEntity<>(seResponse, seResponse.getStatus());
    }
}
