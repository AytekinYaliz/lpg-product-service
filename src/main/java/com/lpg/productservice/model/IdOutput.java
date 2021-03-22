package com.lpg.productservice.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
public class IdOutput<T> {
    private T id;
}
