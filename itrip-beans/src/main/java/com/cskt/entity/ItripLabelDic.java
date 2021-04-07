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
    * 标签字典表
    */
@ApiModel(value="com-cskt-entity-ItripLabelDic")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ItripLabelDic implements Serializable {
    /**
    * 主键
    */
    @ApiModelProperty(value="主键")
    private Long id;

    /**
    * key值
    */
    @ApiModelProperty(value="key值")
    private String name;

    /**
    * value值
    */
    @ApiModelProperty(value="value值")
    private String value;

    /**
    * 描述
    */
    @ApiModelProperty(value="描述")
    private String description;

    /**
    * 父级标签id(1级标签则为0)
    */
    @ApiModelProperty(value="父级标签id(1级标签则为0)")
    private Long parentid;

    /**
    * 标签图片地址
    */
    @ApiModelProperty(value="标签图片地址")
    private String pic;

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