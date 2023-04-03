package com.cxx.springcloud.observer;

import com.cxx.springcloud.observer.OrderMessage;
import com.cxx.springcloud.observer.OrderObserver;
import jakarta.annotation.Resource;

import java.util.List;

public abstract class Publisher {

    @Resource
    List<OrderObserver> observers;

    public void notifyAllObservers() {
        for(OrderObserver orderObserver : observers) {
            orderObserver.afterOrder(new OrderMessage());
        }
    }
}
