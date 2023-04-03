package com.cxx.springcloud.controller;

import com.cxx.springcloud.service.PaymentFeignService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderFeignController {

    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping("/comsumer/get")
    public String getPort() {
        return paymentFeignService.feign();
    }
}
