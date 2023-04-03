package com.cxx.springcloud.observer;

import lombok.Data;

@Data
public class OrderMessage {
    private String orderId;

    private Integer orderStatus;

    private String userId;
}
