package com.Restraunt.FoodMenu.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class GlobalExceptionalHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ErroResponse> handleNotFound(ResourceNotFoundException ex){
        ErroResponse error = new ErroResponse(
                HttpStatus.NOT_FOUND.value(),
                ex.getMessage(),
                LocalDateTime.now()
        );
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }

    public ResponseEntity<ErroResponse> handleAll(Exception ex){
        ErroResponse error = new ErroResponse(
                HttpStatus.INTERNAL_SERVER_ERROR.value(),
                "Something went wrong " + ex.getMessage(),
                LocalDateTime.now()
        );
                return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
