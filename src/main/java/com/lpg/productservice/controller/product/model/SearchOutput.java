package com.lpg.productservice.controller.product.model;

// import com.kypnt.edutest.testcentreservice.controller.AuditDetailsOutput;
// import com.kypnt.edutest.testcentreservice.model.enums.QuestionStatusEnum;
// import com.kypnt.edutest.testcentreservice.model.enums.QuestionTypeEnum;
// import com.kypnt.edutest.testcentreservice.model.response.PageableResponse;
// import io.swagger.annotations.ApiModel;
import com.lpg.productservice.model.enums.Category;
import com.lpg.productservice.model.response.PageableResponse;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Lob;
import java.util.List;

public class SearchOutput<T extends List<SearchOutput.SearchOutputData>> extends PageableResponse.PageableResponseData<T> {

    public SearchOutput(T data, Integer pageNumber, Integer totalPages, Long totalCount) {
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
