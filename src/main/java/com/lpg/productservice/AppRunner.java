package com.lpg.productservice;

import com.lpg.productservice.domain.Product;
import com.lpg.productservice.model.enums.Category;
import com.lpg.productservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.*;
import java.util.Arrays;

@Component
public class AppRunner implements CommandLineRunner {

    @Autowired ProductRepository productRepository;

    @Override
    public void run(String... args) throws Exception {

        // if(productRepository.count() == 0) {
        //     productRepository.saveAll(Arrays.asList(
        //             Product.builder().name("Knife Set").description("A set of knives in all shapes and sizes.").category(Category.KITCHEN)
        //                     .createdAt(OffsetDateTime.of(LocalDateTime.of(2020, 9, 20, 0, 1), ZoneOffset.UTC))
        //                     .modifiedAt(OffsetDateTime.of(LocalDateTime.of(2020, 9, 20, 0, 1), ZoneOffset.UTC))
        //                     .lastPurchasedDate(OffsetDateTime.of(LocalDateTime.of(2020, 10, 24, 0, 1), ZoneOffset.UTC)).build(),
        //             Product.builder().name("Plate Rack").description("A storage solution for plates.").category(Category.KITCHEN)
        //                     .createdAt(OffsetDateTime.of(LocalDateTime.of(2020, 9, 20, 0, 1), ZoneOffset.UTC))
        //                     .modifiedAt(OffsetDateTime.of(LocalDateTime.of(2020, 9, 20, 0, 1), ZoneOffset.UTC))
        //                     .lastPurchasedDate(OffsetDateTime.of(LocalDateTime.of(2020, 10, 19, 0, 1), ZoneOffset.UTC)).build(),
        //             Product.builder().name("Microwave").description("Cook food quick with this handy microwave.").category(Category.KITCHEN)
        //                     .createdAt(OffsetDateTime.of(LocalDateTime.of(2020, 9, 20, 0, 1), ZoneOffset.UTC))
        //                     .modifiedAt(OffsetDateTime.of(LocalDateTime.of(2020, 9, 20, 0, 1), ZoneOffset.UTC))
        //                     .lastPurchasedDate(OffsetDateTime.of(LocalDateTime.of(2020, 10, 24, 0, 1), ZoneOffset.UTC)).build(),
        //             Product.builder().name("Juicer").description("When life gives you lemons, make lemonade.").category(Category.KITCHEN)
        //                     .createdAt(OffsetDateTime.of(LocalDateTime.of(2020, 9, 20, 0, 1), ZoneOffset.UTC))
        //                     .modifiedAt(OffsetDateTime.of(LocalDateTime.of(2020, 9, 20, 0, 1), ZoneOffset.UTC))
        //                     .lastPurchasedDate(OffsetDateTime.of(LocalDateTime.of(2020, 9, 28, 0, 1), ZoneOffset.UTC)).build(),
        //             Product.builder().name("Meat Hooks").description("A butchers meat hook.").category(Category.KITCHEN)
        //                     .createdAt(OffsetDateTime.of(LocalDateTime.of(2020, 9, 20, 0, 1), ZoneOffset.UTC))
        //                     .modifiedAt(OffsetDateTime.of(LocalDateTime.of(2020, 9, 20, 0, 1), ZoneOffset.UTC))
        //                     .lastPurchasedDate(OffsetDateTime.of(LocalDateTime.of(2020, 10, 24, 0, 1), ZoneOffset.UTC)).build(),
        //             Product.builder().name("Cabinet Knobs").description("Make sure you can open your cabinets.").category(Category.KITCHEN)
        //                     .createdAt(OffsetDateTime.of(LocalDateTime.of(2020, 9, 20, 0, 1), ZoneOffset.UTC))
        //                     .modifiedAt(OffsetDateTime.of(LocalDateTime.of(2020, 9, 20, 0, 1), ZoneOffset.UTC))
        //                     .lastPurchasedDate(OffsetDateTime.of(LocalDateTime.of(2020, 10, 19, 0, 1), ZoneOffset.UTC)).build(),
        //             Product.builder().name("Frying Pans").description("ook up a storm with this non stick frying pan.").category(Category.KITCHEN)
        //                     .createdAt(OffsetDateTime.of(LocalDateTime.of(2020, 9, 20, 0, 1), ZoneOffset.UTC))
        //                     .modifiedAt(OffsetDateTime.of(LocalDateTime.of(2020, 9, 28, 0, 1), ZoneOffset.UTC))
        //                     .lastPurchasedDate(OffsetDateTime.of(LocalDateTime.of(2020, 10, 19, 0, 1), ZoneOffset.UTC)).build()
        //
        //     ));
        // }
    }
}