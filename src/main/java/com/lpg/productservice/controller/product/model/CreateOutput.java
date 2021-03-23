package com.lpg.productservice.controller.product.model;

import com.lpg.productservice.model.IdDto;
import com.lpg.productservice.model.enums.Category;


public class CreateOutput extends IdDto<Long> {

    public CreateOutput(Long id) {
        super(id);
    }
}
