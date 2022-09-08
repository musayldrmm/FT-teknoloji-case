package com.FtTeknoloji.FtTeknoloji.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;


@Getter
@Setter
public class BetweenDateAndId {

    private Long id;
    @ApiModelProperty( example = "tarih formati YYYY-MM-DD şeklinde olmali ve date 1 değeri date 2 değerinden önceki bi tarihe sahip olmalı", required = true)
    private Date date1;
    @ApiModelProperty( example = "tarih formati YYYY-MM-DD şeklinde olmali", required = true)
    private Date date2;
}
