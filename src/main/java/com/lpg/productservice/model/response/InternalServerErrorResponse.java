package com.lpg.productservice.model.response;


import java.util.Arrays;

import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;

public class InternalServerErrorResponse extends LpgResponse {

    public InternalServerErrorResponse(String message) { super(null, Arrays.asList(new ResponseError(message)), INTERNAL_SERVER_ERROR); }
}
