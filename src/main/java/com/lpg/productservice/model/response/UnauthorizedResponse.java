package com.lpg.productservice.model.response;


import java.util.Arrays;

import static org.springframework.http.HttpStatus.UNAUTHORIZED;

public class UnauthorizedResponse extends LpgResponse {

    public UnauthorizedResponse(String message) { super(null, Arrays.asList(new ResponseError(message)), UNAUTHORIZED); }
}
