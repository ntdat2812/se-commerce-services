package com.secommerce.product.entity;

import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "products")
public class Product {
    /* ID */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /* Product title */
    private String title;

    /* Price */
    @Column(columnDefinition="Decimal(10,2)")
    private Double price;

    /* Content for product */
    private String content;

    /* Quantity */
    private Integer quantity;

    /* Description */
    @Column(columnDefinition="text")
    private String description;

    @ElementCollection
    @CollectionTable(name = "image_url_product",
            joinColumns = @JoinColumn(name = "product_id", referencedColumnName = "id"), foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key (product_id) references products(id) on delete cascade", name = "fk_product_id")
    )
    private List<String> imageList;

    /* Main image url */
    private String thumbnailImage;

    /* Views */
    private Integer views;

    /* Variant Options*/
    @OneToMany(mappedBy = "product", cascade = CascadeType.REMOVE, fetch = FetchType.LAZY, orphanRemoval = true)
    @OrderBy(value = "id asc")
    private List<VariantOption> options;

    @OneToMany(mappedBy = "product", cascade = CascadeType.REMOVE, fetch = FetchType.LAZY, orphanRemoval = true)
    private List<ProductVariant> variants;

    /* Category (mobile, accessories, components)*/
    @ManyToOne
    @JoinColumn(name = "category_id", referencedColumnName = "id", foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key (category_id) references category(id) on delete set null", name = "fk_product_type"))
    private Category category;

    @OneToMany(mappedBy = "product")
    private List<Attribute> specifications;

    /* Time created */
    @CreatedDate
    @Column(updatable = false)
    private Timestamp createAt;

    /* Time modified */
    @LastModifiedDate
    private Timestamp modifiedAt;
}
