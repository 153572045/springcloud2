package com.cxx.springcloud.observer;

import org.springframework.stereotype.Component;

@Component
public class NotifyObserver implements OrderObserver{
    @Override
    public void afterOrder(OrderMessage orderMessage) {
        System.out.println("Notify ......");
    }
}
