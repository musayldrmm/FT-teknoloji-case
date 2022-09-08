package com.FtTeknoloji.FtTeknoloji.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "products")
@Getter
@Setter
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "_name", length = 50)
    private String name;

    @Column(name = "_price")
    private Long price;

    @ApiModelProperty(notes = "Product experidation date", example = "tarih formati YYYY-MM-DD şeklinde olmali", required = true)
    @Column(name = "_experidation_date", nullable = true)
    private Date expredationDate;


}
