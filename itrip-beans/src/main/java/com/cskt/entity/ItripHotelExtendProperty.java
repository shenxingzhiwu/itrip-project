package com.cskt.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value="com-cskt-entity-ItripHotelExtendProperty")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ItripHotelExtendProperty implements Serializable {
    @ApiModelProperty(value="")
    private Long id;

    /**
    * 酒店id
    */
    @ApiModelProperty(value="酒店id")
    private Long hotelid;

    /**
    * 推广属性
    */
    @ApiModelProperty(value="推广属性")
    private Long extendpropertyid;

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