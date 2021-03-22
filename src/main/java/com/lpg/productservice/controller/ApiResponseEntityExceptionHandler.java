package com.lpg.productservice.controller;


import com.lpg.productservice.model.exception.BadRequestException;
import com.lpg.productservice.model.response.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.List;
import java.util.stream.Collectors;

@ControllerAdvice
@Slf4j
public class ApiResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(Exception.class)
    public LpgResponse handleServerException(Exception ex, WebRequest request) {
        log.error(ex.getMessage(), ex);
        return new InternalServerErrorResponse(ex.getMessage());
    }

    @ExceptionHandler(BadRequestException.class)
    public LpgResponse handleBadRequestException(BadRequestException ex, WebRequest request) {
        log.error(ex.getMessage(), ex);
        return new BadRequestResponse(ex.getMessage());
    }

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        log.error(ex.getMessage(), ex);
        List<ResponseError> errors = ex.getBindingResult()
                // .getAllErrors().stream()
                // .map(e -> new ResponseError(e.getDefaultMessage(), ((FieldError) e).getField()))
                .getFieldErrors().stream()
                .map(e -> new ResponseError(e.getDefaultMessage(), e.getField()))
                .collect(Collectors.toList());

        return new BadRequestResponse(errors);
    }

}
