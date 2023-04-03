package com.cxx.springcloud.controller;

import com.cxx.springcloud.observer.Payment;
import com.cxx.springcloud.observer.CommonResult;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/home")
@Slf4j
public class OrderController {

//    private static final String URL = "http://localhost:8001";

    private static final String URL = "http://CLOUD-PAYMENT-SERVICE";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/create")
    public CommonResult<Payment> create(Payment payment) {
        return restTemplate.postForObject(URL + "/payment/create", payment, CommonResult.class);
    }

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") Long id) {
        log.error("abcdefg");
        Map<String, String> map = new HashMap<>();
        CommonResult forObject = restTemplate.getForObject(URL + "/spring/get/" + id, CommonResult.class);
        ResponseEntity<CommonResult> forEntity = restTemplate.getForEntity(URL + "/spring/get/" + id, CommonResult.class);
        CommonResult body = forEntity.getBody();
        HttpStatusCode statusCode = forEntity.getStatusCode();
        HttpHeaders headers = forEntity.getHeaders();
        return forObject;
    }
}
