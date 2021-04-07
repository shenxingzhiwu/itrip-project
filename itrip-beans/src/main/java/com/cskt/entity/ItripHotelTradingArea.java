package com.cskt.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value="com-cskt-entity-ItripHotelTradingArea")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ItripHotelTradingArea implements Serializable {
    @ApiModelProperty(value="")
    private Long id;

    /**
    * 酒店id
    */
    @ApiModelProperty(value="酒店id")
    private Long hotelid;

    /**
    * 商圈id
    */
    @ApiModelProperty(value="商圈id")
    private Long areaid;

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