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
    * 区域字典表
    */
@ApiModel(value="com-cskt-entity-ItripAreaDic")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ItripAreaDic implements Serializable {
    /**
    * 主键
    */
    @ApiModelProperty(value="主键")
    private Long id;

    /**
    * 区域名称
    */
    @ApiModelProperty(value="区域名称")
    private String name;

    /**
    * 区域编号
    */
    @ApiModelProperty(value="区域编号")
    private String areano;

    /**
    * 父级区域
    */
    @ApiModelProperty(value="父级区域")
    private Long parent;

    /**
    * 0:未激活 1:已激活
    */
    @ApiModelProperty(value="0:未激活 1:已激活")
    private Integer isactivated;

    /**
    * 是否是商圈(0:不是 1:是)
    */
    @ApiModelProperty(value="是否是商圈(0:不是 1:是)")
    private Integer istradingarea;

    /**
    * (0:不是 1：是)
    */
    @ApiModelProperty(value="(0:不是 1：是)")
    private Integer ishot;

    /**
    * 区域级别(0:国家级 1:省级 2:市级 3:县/区)
    */
    @ApiModelProperty(value="区域级别(0:国家级 1:省级 2:市级 3:县/区)")
    private Integer level;

    /**
    * 1:国内 2：国外
    */
    @ApiModelProperty(value="1:国内 2：国外")
    private Integer ischina;

    @ApiModelProperty(value="")
    private String pinyin;

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