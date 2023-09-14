package com.secommerce.common.entity;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.sql.Timestamp;

@MappedSuperclass
public class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /* Time created */
    @CreatedDate
    @Column(updatable = false)
    private Timestamp createAt;

    /* Time modified */
    @LastModifiedDate
    private Timestamp modifiedAt;

}
