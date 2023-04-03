package com.cxx.springcloud.publish;

import java.io.Serializable;

public class PlaceOrderEventMessage implements Serializable {

    /**
     * 订单号
     */
    private String orderId;
    /**
     * 订单状态
     */
    private Integer orderStatus;
    /**
     * 下单用户ID
     */
    private String userId;
}
