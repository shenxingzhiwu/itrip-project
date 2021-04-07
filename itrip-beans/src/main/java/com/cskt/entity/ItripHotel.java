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
    * 酒店表
    */
@ApiModel(value="com-cskt-entity-ItripHotel")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ItripHotel implements Serializable {
    /**
    * 主键
    */
    @ApiModelProperty(value="主键")
    private Long id;

    /**
    * 酒店名称
    */
    @ApiModelProperty(value="酒店名称")
    private String hotelname;

    /**
    * 所在国家id
    */
    @ApiModelProperty(value="所在国家id")
    private Long countryid;

    /**
    * 所在省份id
    */
    @ApiModelProperty(value="所在省份id")
    private Long provinceid;

    /**
    * 所在城市id
    */
    @ApiModelProperty(value="所在城市id")
    private Long cityid;

    /**
    * 酒店所在地址
    */
    @ApiModelProperty(value="酒店所在地址")
    private String address;

    /**
    * 酒店介绍（保存附文本）
    */
    @ApiModelProperty(value="酒店介绍（保存附文本）")
    private String details;

    /**
    * 酒店设施
    */
    @ApiModelProperty(value="酒店设施")
    private String facilities;

    /**
    * 酒店政策
    */
    @ApiModelProperty(value="酒店政策")
    private String hotelpolicy;

    /**
    * 酒店类型(1:国内酒店 2:国际酒店)
    */
    @ApiModelProperty(value="酒店类型(1:国内酒店 2:国际酒店)")
    private Integer hoteltype;

    /**
    * (1:经济酒店  2:二星级酒店  3:三星级 4:四星酒店 5星酒店)
    */
    @ApiModelProperty(value="(1:经济酒店  2:二星级酒店  3:三星级 4:四星酒店 5星酒店)")
    private Integer hotellevel;

    /**
    * 是否是团购酒店
    */
    @ApiModelProperty(value="是否是团购酒店")
    private Integer isgrouppurchase;

    /**
    * 城市名称 冗余字段
    */
    @ApiModelProperty(value="城市名称 冗余字段")
    private String redundantcityname;

    /**
    * 省名称 冗余字段
    */
    @ApiModelProperty(value="省名称 冗余字段")
    private String redundantprovincename;

    /**
    * 国家名称 冗余字段
    */
    @ApiModelProperty(value="国家名称 冗余字段")
    private String redundantcountryname;

    /**
    * 酒店库存（冗余，每天开定时任务的时候更新）
    */
    @ApiModelProperty(value="酒店库存（冗余，每天开定时任务的时候更新）")
    private Integer redundanthotelstore;

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