package com.lpg.productservice.controller.product.model;

import com.lpg.productservice.model.IdOutput;
import com.lpg.productservice.model.enums.Category;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


public class CreateOutput extends IdOutput<Long> {

    public CreateOutput(Long id) {
        super(id);
    }
}
