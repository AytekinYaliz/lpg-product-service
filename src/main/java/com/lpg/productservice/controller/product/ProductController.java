package com.lpg.productservice.controller.product;

import com.lpg.productservice.controller.product.model.SearchInput;
import com.lpg.productservice.controller.product.model.SearchOutput;
import com.lpg.productservice.domain.Product;
import com.lpg.productservice.model.response.LpgResponse;
import com.lpg.productservice.model.response.OKResponse;
import com.lpg.productservice.model.response.PageableResponse;
import com.lpg.productservice.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RequestMapping(path = "api/v1/products")
@RequiredArgsConstructor
@RestController
public class ProductController {

    private final ProductService productService;

    @GetMapping
    public LpgResponse<List<Product>> getAll() {
        log.debug("ProductController.getAll");

        return new OKResponse(productService.getAll());
    }

    @GetMapping("/{id}")
    public LpgResponse<Product> getOne(@PathVariable Long id) {
        log.debug("ProductController.getOne");

        return new OKResponse(productService.getById(id));
    }

    @GetMapping("/search")
    public LpgResponse<PageableResponse.PageableResponseData> search(SearchInput input) {
        log.debug("ProductController.search: " + input.toString());

        return new PageableResponse(productService.search(input));
    }
}
