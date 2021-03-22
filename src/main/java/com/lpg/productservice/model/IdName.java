package com.lpg.productservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class IdName<T> {

    private T id;
    private String name;
}
