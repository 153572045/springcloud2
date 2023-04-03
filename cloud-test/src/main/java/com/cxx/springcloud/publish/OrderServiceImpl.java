package com.cxx.springcloud.publish;

import jakarta.annotation.Resource;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import java.util.concurrent.Flow;
import java.util.concurrent.SubmissionPublisher;

@Service
public class OrderServiceImpl {

    @Resource
    private ApplicationEventPublisher applicationEventPublisher;

    public void placeOrder() {
        applicationEventPublisher.publishEvent(new PlaceOrderEvent(new PlaceOrderEventMessage()));
    }

}
