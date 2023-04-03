package com.cxx.springcloud.controller;

import com.cxx.springcloud.publish.OrderServiceImpl;
import com.cxx.springcloud.service.OrderService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/index")
public class TestController {

    @Resource
    private OrderService orderService;

    @Resource
    OrderServiceImpl orderServiceImpl;

    @GetMapping
    public String test() {
        orderServiceImpl.placeOrder();
        return "abchello";
    }
}
