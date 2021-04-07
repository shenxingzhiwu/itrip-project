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
    * 订单表
    */
@ApiModel(value="com-cskt-entity-ItripHotelOrder")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ItripHotelOrder implements Serializable {
    /**
    * 主键
    */
    @ApiModelProperty(value="主键")
    private Long id;

    /**
    * 用户id
    */
    @ApiModelProperty(value="用户id")
    private Long userid;

    /**
    * 订单类型(0:旅游产品 1:酒店产品 2：机票产品)
    */
    @ApiModelProperty(value="订单类型(0:旅游产品 1:酒店产品 2：机票产品)")
    private Integer ordertype;

    /**
    * 订单号
    */
    @ApiModelProperty(value="订单号")
    private String orderno;

    /**
    * 交易编号
    */
    @ApiModelProperty(value="交易编号")
    private String tradeno;

    /**
    * 冗余字段 酒店id
    */
    @ApiModelProperty(value="冗余字段 酒店id")
    private Long hotelid;

    /**
    * 冗余字段 酒店名称
    */
    @ApiModelProperty(value="冗余字段 酒店名称")
    private String hotelname;

    /**
    * 房间id
    */
    @ApiModelProperty(value="房间id")
    private Long roomid;

    /**
    * 消耗数量
    */
    @ApiModelProperty(value="消耗数量")
    private Integer count;

    /**
    * 预订天数
    */
    @ApiModelProperty(value="预订天数")
    private Integer bookingdays;

    /**
    * 入住时间
    */
    @ApiModelProperty(value="入住时间")
    private LocalDateTime checkindate;

    /**
    * 退房时间
    */
    @ApiModelProperty(value="退房时间")
    private LocalDateTime checkoutdate;

    /**
    * 订单状态（0：待支付 1:已取消 2:支付成功 3:已消费 4：已点评）
    */
    @ApiModelProperty(value="订单状态（0：待支付 1:已取消 2:支付成功 3:已消费 4：已点评）")
    private Integer orderstatus;

    /**
    * 支付金额
    */
    @ApiModelProperty(value="支付金额")
    private BigDecimal payamount;

    /**
    * 支付方式:1:支付宝 2:微信 3:到店付
    */
    @ApiModelProperty(value="支付方式:1:支付宝 2:微信 3:到店付")
    private Integer paytype;

    /**
    * 联系手机号
    */
    @ApiModelProperty(value="联系手机号")
    private String noticephone;

    /**
    * 联系邮箱
    */
    @ApiModelProperty(value="联系邮箱")
    private String noticeemail;

    /**
    * 特殊需求
    */
    @ApiModelProperty(value="特殊需求")
    private String specialrequirement;

    /**
    * 是否需要发票（0：不需要 1：需要）
    */
    @ApiModelProperty(value="是否需要发票（0：不需要 1：需要）")
    private Integer isneedinvoice;

    /**
    * 发票类型（0：个人 1：公司）
    */
    @ApiModelProperty(value="发票类型（0：个人 1：公司）")
    private Integer invoicetype;

    /**
    * 发票抬头
    */
    @ApiModelProperty(value="发票抬头")
    private String invoicehead;

    /**
    * 入住人名称
    */
    @ApiModelProperty(value="入住人名称")
    private String linkusername;

    /**
    * 0:WEB端 1:手机端 2:其他客户端
    */
    @ApiModelProperty(value="0:WEB端 1:手机端 2:其他客户端")
    private Integer booktype;

    /**
    * 预定时间
    */
    @ApiModelProperty(value="预定时间")
    private LocalDateTime creationdate;

    @ApiModelProperty(value="")
    private Long createdby;

    /**
    * 支付完成时间
    */
    @ApiModelProperty(value="支付完成时间")
    private LocalDateTime modifydate;

    @ApiModelProperty(value="")
    private Long modifiedby;

    private static final long serialVersionUID = 1L;
}