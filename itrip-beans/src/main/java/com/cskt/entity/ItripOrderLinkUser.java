package com.cskt.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value="com-cskt-entity-ItripOrderLinkUser")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ItripOrderLinkUser implements Serializable {
    /**
    * 主键
    */
    @ApiModelProperty(value="主键")
    private Long id;

    /**
    * 订单id
    */
    @ApiModelProperty(value="订单id")
    private Long orderid;

    /**
    * 联系人id
    */
    @ApiModelProperty(value="联系人id")
    private Long linkuserid;

    /**
    * 入住人姓名逗号分隔
    */
    @ApiModelProperty(value="入住人姓名逗号分隔")
    private String linkusername;

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