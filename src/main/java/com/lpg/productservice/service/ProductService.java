package com.lpg.productservice.service;

import com.lpg.productservice.controller.product.model.CreateInput;
import com.lpg.productservice.controller.product.model.SearchInput;
import com.lpg.productservice.controller.product.model.SearchOutput;
import com.lpg.productservice.model.enums.Category;
import com.lpg.productservice.domain.Product;
import com.lpg.productservice.repository.ProductRepository;
import io.micrometer.core.instrument.util.StringUtils;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.time.TimeZones;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Slf4j
@RequiredArgsConstructor
@Service
public class ProductService {

    private final ProductRepository productRepository;

    public List<Product> getAll() {
        return StreamSupport
                .stream(productRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }

    public Product getById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    public SearchOutput search(SearchInput input) {
        Pageable pageable = Utils.getPageable(input);
        Page<Product> productsPage = productRepository.findAll(pageable);
        List<SearchOutput.SearchOutputData> data = productsPage.stream()
                .map(p -> SearchOutput.SearchOutputData.builder()
                        .id(p.getId())
                        .name(p.getName())
                        .description(p.getDescription())
                        .category(p.getCategory())
                        .build()
                ).collect(Collectors.toList());

        return new SearchOutput(data, productsPage.getNumber(), productsPage.getTotalPages(), productsPage.getTotalElements());
    }

    public Long create(CreateInput input) {
        Product product = Product.builder()
                .name(input.getName())
                .description(input.getDescription())
                .category(input.getCategory())
                .build();

        productRepository.save(product);

        return product.getId();
    }
}
