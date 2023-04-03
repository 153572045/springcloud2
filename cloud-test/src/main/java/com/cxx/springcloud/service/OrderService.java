package com.cxx.springcloud.service;

import com.cxx.springcloud.observer.OrderObserver;
import com.cxx.springcloud.observer.OrderPublisher;
import com.cxx.springcloud.observer.Publisher;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Resource
    private List<OrderObserver> observers;

    @Resource
    private Publisher publisher;

    public void test() {
        ((OrderPublisher)publisher).order();
    }
}
