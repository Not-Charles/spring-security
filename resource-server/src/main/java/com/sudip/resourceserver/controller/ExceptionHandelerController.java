package com.sudip.resourceserver.controller;

import com.sudip.resourceserver.dto.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ExceptionHandelerController {

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<ErrorResponse> handleGenericException(HttpServletRequest request, RuntimeException ex){
        ErrorResponse response = new ErrorResponse("Error found",request.getRequestURI(),ex.getMessage());
        return new ResponseEntity<>(response, HttpStatus.EXPECTATION_FAILED);
    }
}
