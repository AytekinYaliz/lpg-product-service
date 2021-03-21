package com.lpg.productservice.model.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
public class PageableResponse<T> extends OKResponse<PageableResponse.PageableResponseData> {

    public PageableResponse(PageableResponseData data) {
        super(data);
    }

    @Getter
    @AllArgsConstructor
    public static class PageableResponseData<T> {
        private T data;
        private int pageIndex = 0;
        private int totalPages = 0;
        private long totalCount = 0;
    }
}
