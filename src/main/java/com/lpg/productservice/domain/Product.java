package com.lpg.productservice.domain;

import com.lpg.productservice.model.enums.Category;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.time.OffsetDateTime;

@SuperBuilder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="PRODUCT")
public class Product extends AuditDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private Long id;

    @Column(name="NAME")
    private String name;

    @Column(name="DESCRIPTION")
    private String description;

    @Enumerated(EnumType.STRING)
    @Column(name="CATEGORY")
    private Category category;

    @Column(name="LAST_PURCHASED_DATE")
    private OffsetDateTime lastPurchasedDate;
}
