package com.secommerce.product.entity;

import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Getter
@Setter
public class Category {
    /* Category ID */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /* Category name */
    @Column(unique = true)
    private String name;

    /* Category child */
    @ManyToOne
    @JoinColumn(name = "parent_id", referencedColumnName = "id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Category categoryParent;

    private Boolean disable;

    /* Time created */
    @CreatedDate
    @Column(updatable = false)
    private Timestamp createAt;

    /* Time modified */
    @LastModifiedDate
    private Timestamp modifiedAt;

}
