package com.cxx.springcloud.publish;

import com.cxx.springcloud.publish.PlaceOrderEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class OrderNotifyListener implements ApplicationListener<PlaceOrderEvent> {
    @Override
    public void onApplicationEvent(PlaceOrderEvent event) {
        System.out.println("OrderNotify...");
    }
}
