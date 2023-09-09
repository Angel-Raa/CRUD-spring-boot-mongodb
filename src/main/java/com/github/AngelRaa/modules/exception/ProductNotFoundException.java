package com.github.AngelRaa.modules.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.time.LocalDateTime;
@ResponseStatus(HttpStatus.NOT_FOUND)
public class ProductNotFoundException extends HandlerException{
    public ProductNotFoundException(String message, Integer code, HttpStatus status, LocalDateTime timestamp) {
        super(message, code, status, timestamp);
    }
}
