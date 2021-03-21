package com.lpg.productservice.model.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
public class PageableResponse<T> extends OKResponse<PageableResponse.PageableResponseData> {

    public PageableResponse(PageableResponseData data) {
        super(data);
    }

    @Getter
    @AllArgsConstructor
    public static class PageableResponseData<T> {
        private List<T> records;
        private int pageIndex = 0;
        private int totalPages = 0;
        private long totalRecords = 0;
    }
}
