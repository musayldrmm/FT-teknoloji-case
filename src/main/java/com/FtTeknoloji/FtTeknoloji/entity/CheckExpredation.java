package com.FtTeknoloji.FtTeknoloji.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
public class CheckExpredation {
    @ApiModelProperty( example = "tarih formati YYYY-MM-DD şeklinde olmali", required = true)
     private Date date;
}
