package com.lpg.productservice.controller.product.model;

import com.lpg.productservice.model.request.PageableInput;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class SearchInput extends PageableInput {
    private String name;
    private String description;
}
