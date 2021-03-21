package com.lpg.productservice.model.response;


import static org.springframework.http.HttpStatus.OK;

public class OKResponse<T> extends LpgResponse<T> {

    public OKResponse(T data) {
        super(data, null, OK);
    }
}
