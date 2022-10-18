package com.secommerce.common.response;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
public class SeResponse {

    private final HttpStatus status;
    private final String message;
    private final Object result;

    public static final SeResponse SUCCESS =
            new SeResponse(HttpStatus.OK, "api.success");

    public static final SeResponse INTERNAL_SERVER_ERROR =
            new SeResponse(HttpStatus.INTERNAL_SERVER_ERROR, "api.internal.server.error");

    public static final SeResponse UNAUTHORIZED =
            new SeResponse(HttpStatus.UNAUTHORIZED, "unauthorized");

    public static final SeResponse FORBIDDEN =
            new SeResponse(HttpStatus.FORBIDDEN, "forbidden");

    public static final SeResponse BAD_REQUEST =
            new SeResponse(HttpStatus.BAD_REQUEST, "api.bad.request");

    public static final SeResponse FAILED_VALIDATION =
            new SeResponse(HttpStatus.BAD_REQUEST, "api.failed.validation");

    public static final SeResponse RESOURCE_NOT_FOUND =
            new SeResponse(HttpStatus.NOT_FOUND, "resource.not.found");

    public static final SeResponse TOO_MANY_REQUEST =
            new SeResponse(HttpStatus.TOO_MANY_REQUESTS, "too.many.requests");

    public SeResponse(HttpStatus status, String message, Object result) {
        this.status = status;
        this.message = message;
        this.result = result;
    }

    public SeResponse(HttpStatus status, String message) {
        this.status = status;
        this.message = message;
        this.result = null;
    }

    public SeResponse withResult(Object result) {
        return new SeResponse(status, message, result);
    }

    public SeResponse withMessage(String message) {
        return new SeResponse(status, message, result);
    }

}
