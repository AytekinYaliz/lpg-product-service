package com.lpg.productservice.model.response;


import static org.springframework.http.HttpStatus.CREATED;

public class CreatedResponse<T> extends LpgResponse<T> {

    public CreatedResponse(T metadata) {
        super(metadata, null, CREATED);
    }
}
