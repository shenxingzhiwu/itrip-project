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
    * 实时库存表
    */
@ApiModel(value="com-cskt-entity-ItripHotelTempStore")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ItripHotelTempStore implements Serializable {
    @ApiModelProperty(value="")
    private Long id;

    @ApiModelProperty(value="")
    private Integer hotelid;

    /**
    * 商品id
    */
    @ApiModelProperty(value="商品id")
    private Long roomid;

    /**
    * 记录时间
    */
    @ApiModelProperty(value="记录时间")
    private LocalDateTime recorddate;

    /**
    * 库存
    */
    @ApiModelProperty(value="库存")
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