package com.lpg.productservice.controller.product;

import com.lpg.productservice.controller.product.model.CreateInput;
import com.lpg.productservice.controller.product.model.CreateOutput;
import com.lpg.productservice.controller.product.model.SearchInput;
import com.lpg.productservice.controller.product.model.SearchOutput;
import com.lpg.productservice.domain.Product;
import com.lpg.productservice.model.IdOutput;
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

    @PostMapping
    public LpgResponse<CreateOutput> create(@Valid @RequestBody CreateInput input) {
        log.debug("ProductController.create: " + input.toString());

        CreateOutput output = new CreateOutput(productService.create(input));

        return new CreatedResponse<>(output);
    }
}
