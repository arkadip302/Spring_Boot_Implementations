package com.arkadip.apiCall.ErroHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class UserGreetingExcpetionHandler {

    @ExceptionHandler(value = NullPointerException.class)
    public ResponseEntity<String> handleNullPoinerException(NullPointerException exception) {
        System.err.println("Here");
        return new ResponseEntity<>(exception.getMessage(), HttpStatus.NOT_ACCEPTABLE);
    }

}
