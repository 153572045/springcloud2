package com.cxx.springcloud.observer;

public interface OrderObserver {
    void afterOrder(OrderMessage orderMessage);
}
