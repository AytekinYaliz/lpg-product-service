package com.lpg.productservice.service;

import com.lpg.productservice.model.request.PageableInput;
import org.apache.commons.lang3.StringUtils;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

public class Utils {

    public static Pageable getPageable(PageableInput pageInput) {

        if (StringUtils.isNotEmpty(pageInput.getSortField())) {
            Sort sort = null;
            if (StringUtils.equalsIgnoreCase(pageInput.getSortOrder(), "desc")) {
                sort = Sort.by(Sort.Direction.DESC, pageInput.getSortField());
            } else {
                sort = Sort.by(Sort.Direction.ASC, pageInput.getSortField());
            }
            Pageable paging = PageRequest.of(pageInput.getPageIndex(), pageInput.getPageSize(), sort);
            return paging;
        } else {
            Pageable paging = PageRequest.of(pageInput.getPageIndex(), pageInput.getPageSize());
            return paging;
        }
    }
}
