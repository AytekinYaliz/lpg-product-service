package com.lpg.productservice.model.response;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

public abstract class LpgResponse<T> extends ResponseEntity<ResponseBody> {

    public LpgResponse(T metadata, List<ResponseError> errors, HttpStatus status) {
        super(new ResponseBody(metadata, errors, status), status);
    }
}
