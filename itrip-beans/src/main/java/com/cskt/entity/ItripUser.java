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
    * 用户表
    */
@ApiModel(value="com-cskt-entity-ItripUser")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ItripUser implements Serializable {
    /**
    * 主键
    */
    @ApiModelProperty(value="主键")
    private Long id;

    /**
    * 若是第三方登录，系统将自动生成唯一账号；自注册用户则为邮箱或者手机号
    */
    @ApiModelProperty(value="若是第三方登录，系统将自动生成唯一账号；自注册用户则为邮箱或者手机号")
    private String usercode;

    /**
    * 若是第三方登录，系统将自动生成唯一密码；自注册用户则为自定义密码
    */
    @ApiModelProperty(value="若是第三方登录，系统将自动生成唯一密码；自注册用户则为自定义密码")
    private String userpassword;

    /**
    * 用户类型（标识：0 自注册用户 1 微信登录 2 QQ登录 3 微博登录）
    */
    @ApiModelProperty(value="用户类型（标识：0 自注册用户 1 微信登录 2 QQ登录 3 微博登录）")
    private Integer usertype;

    /**
    * 平台ID（根据不同登录用户，进行相应存入：自注册用户主键ID、微信ID、QQID、微博ID）
    */
    @ApiModelProperty(value="平台ID（根据不同登录用户，进行相应存入：自注册用户主键ID、微信ID、QQID、微博ID）")
    private Long flatid;

    /**
    * 用户昵称
    */
    @ApiModelProperty(value="用户昵称")
    private String username;

    /**
    * 微信号
    */
    @ApiModelProperty(value="微信号")
    private String wechat;

    /**
    * qq账号
    */
    @ApiModelProperty(value="qq账号")
    private String qq;

    /**
    * 微博账号
    */
    @ApiModelProperty(value="微博账号")
    private String weibo;

    /**
    * 百度账号
    */
    @ApiModelProperty(value="百度账号")
    private String baidu;

    @ApiModelProperty(value="")
    private LocalDateTime creationdate;

    @ApiModelProperty(value="")
    private Long createdby;

    @ApiModelProperty(value="")
    private LocalDateTime modifydate;

    @ApiModelProperty(value="")
    private Long modifiedby;

    /**
    * 是否激活,(0 false，1 true,默认是0)
    */
    @ApiModelProperty(value="是否激活,(0 false，1 true,默认是0)")
    private Integer activated;

    private static final long serialVersionUID = 1L;
}