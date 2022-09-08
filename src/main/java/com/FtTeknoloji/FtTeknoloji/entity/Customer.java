package com.FtTeknoloji.FtTeknoloji.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "customer")
@Getter
@Setter


public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @ApiModelProperty(readOnly = true)
    private long id;

    @Column(name = "name", length = 50)
    private String name;

    @Column(name = "surname", length = 50)
    private String surname;

    @Column(name = "mail", unique = true, length = 50)
    private String email;

    @Column(name = "phonenumber", length = 15)
    private String phonenumber;

}
