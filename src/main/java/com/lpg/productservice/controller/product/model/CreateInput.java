package com.lpg.productservice.controller.product.model;

import com.lpg.productservice.model.enums.Category;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class CreateInput {

    @NotBlank
    @Size(min = 1, max = 50)
    private String name;

    private String description;

    @NotNull
    private Category category;
}
