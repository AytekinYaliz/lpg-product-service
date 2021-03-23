package com.lpg.productservice.controller.product;

import com.lpg.productservice.advice.ExecutionTimeTracker;
import com.lpg.productservice.controller.product.model.CreateInput;
import com.lpg.productservice.controller.product.model.CreateOutput;
import com.lpg.productservice.controller.product.model.SearchInput;
import com.lpg.productservice.controller.product.model.SearchOutput;
import com.lpg.productservice.domain.Product;
import com.lpg.productservice.model.response.CreatedResponse;
import com.lpg.productservice.model.response.LpgResponse;
import com.lpg.productservice.model.response.OKResponse;
import com.lpg.productservice.model.response.PageableResponse;
import com.lpg.productservice.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Slf4j
@RequestMapping(path = "api/v1/products")
@RequiredArgsConstructor
@RestController
public class ProductController {

    private final ProductService productService;

    @ExecutionTimeTracker
    @GetMapping
    public LpgResponse<List<Product>> getAll() {
        return new OKResponse(productService.getAll());
    }

    @ExecutionTimeTracker
    @GetMapping("/{id}")
    public LpgResponse<Product> getOne(@PathVariable Long id) {
        return new OKResponse(productService.getById(id));
    }

    @ExecutionTimeTracker
    @GetMapping("/search")
    public LpgResponse<PageableResponse.PageableResponseData> search(SearchInput input) {
        return new PageableResponse(productService.search(input));
    }

    @ExecutionTimeTracker
    @PostMapping
    public LpgResponse<CreateOutput> create(@Valid @RequestBody CreateInput input) {
        CreateOutput output = new CreateOutput(productService.create(input));

        return new CreatedResponse<>(output);
    }
}
