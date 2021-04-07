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
    * 图片表
    */
@ApiModel(value="com-cskt-entity-ItripImage")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ItripImage implements Serializable {
    /**
    * 主键
    */
    @ApiModelProperty(value="主键")
    private Long id;

    /**
    * 图片类型(0:酒店图片1:房间图片2:评论图片)
    */
    @ApiModelProperty(value="图片类型(0:酒店图片1:房间图片2:评论图片)")
    private String type;

    /**
    * 关联id
    */
    @ApiModelProperty(value="关联id")
    private Long targetid;

    /**
    * 图片s上传顺序位置
    */
    @ApiModelProperty(value="图片s上传顺序位置")
    private Integer position;

    /**
    * 图片地址
    */
    @ApiModelProperty(value="图片地址")
    private String imgurl;

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