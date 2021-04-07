package com.cskt.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
    * 订单支付完成后，系统需对该订单进行后续处理，如减库存等。处理完成后，删除此表中的订单记录
    */
@ApiModel(value="com-cskt-entity-ItripTradeEnds")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ItripTradeEnds implements Serializable {
    /**
    * 订单ID
    */
    @ApiModelProperty(value="订单ID")
    private Long id;

    /**
    * 订单编号(注意非支付宝交易编号tradeNo)
    */
    @ApiModelProperty(value="订单编号(注意非支付宝交易编号tradeNo)")
    private String orderno;

    /**
    * 标识字段(默认0：未处理；1：处理中)
    */
    @ApiModelProperty(value="标识字段(默认0：未处理；1：处理中)")
    private Boolean flag;

    private static final long serialVersionUID = 1L;
}