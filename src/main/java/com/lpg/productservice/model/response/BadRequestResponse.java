package com.lpg.productservice.model.response;


import java.util.Arrays;
import java.util.List;

import static org.springframework.http.HttpStatus.BAD_REQUEST;

public class BadRequestResponse extends LpgResponse {

    public BadRequestResponse(String message) { this(Arrays.asList(new ResponseError(message))); }

    public BadRequestResponse(List<ResponseError> errors) { super(null, errors, BAD_REQUEST); }
}
