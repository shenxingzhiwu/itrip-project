package com.cskt.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
    * 酒店房间表
    */
@ApiModel(value="com-cskt-entity-ItripHotelRoom")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ItripHotelRoom implements Serializable {
    /**
    * 主键
    */
    @ApiModelProperty(value="主键")
    private Long id;

    /**
    * 酒店ID
    */
    @ApiModelProperty(value="酒店ID")
    private Long hotelid;

    /**
    * 房间名称
    */
    @ApiModelProperty(value="房间名称")
    private String roomtitle;

    /**
    * 房间价格
    */
    @ApiModelProperty(value="房间价格")
    private BigDecimal roomprice;

    /**
    * 酒店床型
    */
    @ApiModelProperty(value="酒店床型")
    private Long roombedtypeid;

    /**
    * 是否包含早餐
    */
    @ApiModelProperty(value="是否包含早餐")
    private Integer ishavingbreakfast;

    /**
    * 1:在线付 2:到店付 3:不限
    */
    @ApiModelProperty(value="1:在线付 2:到店付 3:不限")
    private Integer paytype;

    /**
    * 满意度（冗余字段，在用户评论后更新）
    */
    @ApiModelProperty(value="满意度（冗余字段，在用户评论后更新）")
    private Long satisfaction;

    /**
    * 是否可预订(0:不可以 1:可以)
    */
    @ApiModelProperty(value="是否可预订(0:不可以 1:可以)")
    private Integer isbook;

    /**
    * 是否可取消(0:不可 1:可以)
    */
    @ApiModelProperty(value="是否可取消(0:不可 1:可以)")
    private Integer iscancel;

    /**
    * 是否及时响应(0:不及时 1:及时)
    */
    @ApiModelProperty(value="是否及时响应(0:不及时 1:及时)")
    private Integer istimelyresponse;

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