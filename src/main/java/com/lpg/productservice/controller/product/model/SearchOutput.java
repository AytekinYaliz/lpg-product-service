package com.lpg.productservice.controller.product.model;

import com.lpg.productservice.model.enums.Category;
import com.lpg.productservice.model.response.PageableResponse;
import lombok.Builder;
import lombok.Data;

import java.util.List;

public class SearchOutput<T extends SearchOutput.SearchOutputData> extends PageableResponse.PageableResponseData<T> {

    public SearchOutput(List<T> data, Integer pageNumber, Integer totalPages, Long totalCount) {
        super(data, pageNumber, totalPages, totalCount);
    }

    @Builder
    @Data
    public static class SearchOutputData {
        private Long id;
        private String name;
        private String description;
        private Category category;
    }
}
