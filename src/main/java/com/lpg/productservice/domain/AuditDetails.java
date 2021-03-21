package com.lpg.productservice.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.OffsetDateTime;

@Data
@SuperBuilder
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@NoArgsConstructor
@AllArgsConstructor
public class AuditDetails {

    @CreatedDate
    @Column(name="CREATION_DATE", nullable=false)
    @NotNull(message="Created at field is required")
    private OffsetDateTime createdAt;

    @LastModifiedDate
    @Column(name="UPDATE_DATE")
    private OffsetDateTime modifiedAt;

    // @CreatedBy
    // @Column(nullable = false)
    // @NotBlank(message = "Created by field is required")
    // private String createdBy;

    // @LastModifiedBy
    // private String modifiedBy;
    //
    // @Column(nullable = false)
    // @NotNull(message = "isDeleted field is required")
    // private Boolean isDeleted = false;
}
