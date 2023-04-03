package com.cxx.springcloud.publish;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class OrderLogListener implements ApplicationListener<PlaceOrderEvent> {

    @Override
    public void onApplicationEvent(PlaceOrderEvent event) {
        System.out.println("orderLog...");
    }
}
