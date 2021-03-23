package com.lpg.productservice.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
public class IdDto<T> {
    private T id;
}
