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
    * 评论表
    */
@ApiModel(value="com-cskt-entity-ItripComment")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ItripComment implements Serializable {
    /**
    * 主键
    */
    @ApiModelProperty(value="主键")
    private Long id;

    /**
    * 如果产品是酒店的话 改字段保存酒店id
    */
    @ApiModelProperty(value="如果产品是酒店的话 改字段保存酒店id")
    private Long hotelid;

    /**
    * 商品id
    */
    @ApiModelProperty(value="商品id")
    private Long productid;

    /**
    * 订单id
    */
    @ApiModelProperty(value="订单id")
    private Long orderid;

    /**
    * 商品类型(0:旅游产品 1:酒店产品 2:机票产品)
    */
    @ApiModelProperty(value="商品类型(0:旅游产品 1:酒店产品 2:机票产品)")
    private Integer producttype;

    /**
    * 评论内容
    */
    @ApiModelProperty(value="评论内容")
    private String content;

    /**
    * 用户编号
    */
    @ApiModelProperty(value="用户编号")
    private Long userid;

    /**
    * 是否包含图片(当用户上传评论时检测)0:无图片 1:有图片
    */
    @ApiModelProperty(value="是否包含图片(当用户上传评论时检测)0:无图片 1:有图片")
    private Integer ishavingimg;

    /**
    * 位置评分
    */
    @ApiModelProperty(value="位置评分")
    private Integer positionscore;

    /**
    * 设施评分
    */
    @ApiModelProperty(value="设施评分")
    private Integer facilitiesscore;

    /**
    * 服务评分
    */
    @ApiModelProperty(value="服务评分")
    private Integer servicescore;

    /**
    * 卫生评分
    */
    @ApiModelProperty(value="卫生评分")
    private Integer hygienescore;

    /**
    * 综合评分
    */
    @ApiModelProperty(value="综合评分")
    private Integer score;

    /**
    * 出游类型
    */
    @ApiModelProperty(value="出游类型")
    private Long tripmode;

    /**
    * 是否满意（0：有待改善 1：值得推荐）
    */
    @ApiModelProperty(value="是否满意（0：有待改善 1：值得推荐）")
    private Integer isok;

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