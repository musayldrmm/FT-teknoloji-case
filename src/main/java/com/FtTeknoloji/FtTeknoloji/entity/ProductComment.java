package com.FtTeknoloji.FtTeknoloji.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "Product_Comment")
@Getter
@Setter
public class ProductComment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "_comment", length = 500)
    private String comment;

    @ApiModelProperty(notes = "Product comment date", example = "tarih formati YYYY-MM-DD şeklinde olmali", required = true)
    @Column(name = "_comment_date", nullable = false)
    private Date commentDate;

    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "customer_id")
    private Customer customerId;

    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "product_id")
    private Product productId;

}
