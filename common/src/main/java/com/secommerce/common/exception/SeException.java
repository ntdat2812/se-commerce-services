package com.secommerce.common.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public class SeException extends RuntimeException {

    private final HttpStatus status;
    private final String message;

}
