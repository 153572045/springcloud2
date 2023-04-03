package com.cxx.springcloud.publish;

import org.springframework.context.ApplicationEvent;

public class PlaceOrderEvent extends ApplicationEvent {

    public PlaceOrderEvent(PlaceOrderEventMessage message) {
        super(message);
    }
}
