package com.cskt.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
    * 原始库存表
    */
@ApiModel(value="com-cskt-entity-ItripProductStore")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ItripProductStore implements Serializable {
    @ApiModelProperty(value="")
    private Long id;

    /**
    * 商品类型(0:旅游产品 1:酒店产品 2:机票产品)
    */
    @ApiModelProperty(value="商品类型(0:旅游产品 1:酒店产品 2:机票产品)")
    private Integer producttype;

    /**
    * 商品id
    */
    @ApiModelProperty(value="商品id")
    private Long productid;

    /**
    * 商品库存
    */
    @ApiModelProperty(value="商品库存")
    private Integer store;

    @ApiModelProperty(value="")
    private LocalDateTime creationdate;

    @ApiModelProperty(value="")
    private Long createdby;

    @ApiModelProperty(value="")
    private LocalDateTime modifydate;

    @ApiModelProperty(value="")
    private Long modifiedby;

    private static final long serialVersionUID = 1L;
}