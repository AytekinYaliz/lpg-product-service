package com.lpg.productservice.repository;

import com.lpg.productservice.domain.Product;
import com.lpg.productservice.model.enums.Category;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@RequiredArgsConstructor
@DataJpaTest
class ProductRepositoryTest {

    @Autowired ProductRepository productRepository;

    @Test
    void itShouldCheckIfProductExistsByName() {
        Product product = Product.builder()
                .name("nameToCheck")
                .description("description here")
                .category(Category.KITCHEN)
                .build();

        productRepository.save(product);

        assertThat(product.getId()).isEqualTo(35);

        Product productFromDb = productRepository.getOne(product.getId());

        assertThat(productFromDb).isNotNull();
        assertEquals(productRepository.selectExistsProduct(product.getName()), true);
    }
}