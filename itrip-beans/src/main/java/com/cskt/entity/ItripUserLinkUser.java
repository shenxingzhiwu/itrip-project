package com.cskt.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value="com-cskt-entity-ItripUserLinkUser")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ItripUserLinkUser implements Serializable {
    /**
    * 主键
    */
    @ApiModelProperty(value="主键")
    private Long id;

    /**
    * 常用联系人姓名
    */
    @ApiModelProperty(value="常用联系人姓名")
    private String linkusername;

    /**
    * 证件号码
    */
    @ApiModelProperty(value="证件号码")
    private String linkidcard;

    /**
    * 常用联系人电话
    */
    @ApiModelProperty(value="常用联系人电话")
    private String linkphone;

    /**
    * 用户id
    */
    @ApiModelProperty(value="用户id")
    private Integer userid;

    @ApiModelProperty(value="")
    private LocalDateTime creationdate;

    @ApiModelProperty(value="")
    private Long createdby;

    @ApiModelProperty(value="")
    private LocalDateTime modifydate;

    @ApiModelProperty(value="")
    private Long modifiedby;

    /**
    * 证件类型：(0-身份证，1-护照，2-学生证，3-军人证，4-驾驶证，5-旅行证)
    */
    @ApiModelProperty(value="证件类型：(0-身份证，1-护照，2-学生证，3-军人证，4-驾驶证，5-旅行证)")
    private Integer linkidcardtype;

    private static final long serialVersionUID = 1L;
}