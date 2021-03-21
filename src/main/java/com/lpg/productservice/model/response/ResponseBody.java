package com.lpg.productservice.model.response;

import lombok.Data;
import org.springframework.http.HttpStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class ResponseBody<T> {
    T metadata;
    List<ResponseError> errors;
    String timestamp;

    public ResponseBody(T metadata, List<ResponseError> errors, HttpStatus status) {
        this.metadata = metadata;
        this.errors = errors != null ? errors : new ArrayList<>();
        this.timestamp = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:sss'Z'")
                .format(new Date(System.currentTimeMillis()));
    }
}
