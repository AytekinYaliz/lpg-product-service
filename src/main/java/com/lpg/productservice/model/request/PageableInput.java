package com.lpg.productservice.model.request;

import lombok.Data;

@Data
public class PageableInput {
    private Integer pageIndex = 0;
    private Integer pageSize = 10;
    private String sortField = null;
    private String sortOrder = null;
}