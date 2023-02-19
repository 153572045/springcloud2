package com.cxx.springcloud.controller;

import com.cxx.springcloud.entities.CommonResult;
import com.cxx.springcloud.entities.Payment;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/home")
public class OrderController {

    private static final String URL = "http://localhost:8081";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/create")
    public CommonResult<Payment> create(Payment payment) {
        return restTemplate.postForObject(URL + "/payment/create", payment, CommonResult.class);
    }

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") Long id) {
        return restTemplate.getForObject(URL + "/spring/get/" + id, CommonResult.class);
    }
}
