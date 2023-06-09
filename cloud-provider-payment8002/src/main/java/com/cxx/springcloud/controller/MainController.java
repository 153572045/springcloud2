package com.cxx.springcloud.controller;

import com.cxx.springcloud.observer.CommonResult;
import com.cxx.springcloud.observer.Payment;
import com.cxx.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("spring")
public class MainController {

    @Value("${server.port}")
    private String serverPort;

    @Autowired
    private PaymentService paymentService;


    @GetMapping("/first")
    public List<Payment> getT() {
        return paymentService.getPayments();
    }

    @GetMapping("/get/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public CommonResult<Payment> getById(@PathVariable("id") Integer id) {
        Payment payment = paymentService.getPaymentById(id);
        return new CommonResult<>(200, "successful" + serverPort, payment);
    }

    @RequestMapping("/temp")
    public Payment test(String serial) {
        return new Payment(5L, serial);
    }

    @RequestMapping("/temp2")
    public Payment test2(@RequestBody Payment payment) {
        return payment;
    }

    @RequestMapping("/feign")
    public String feign() throws Exception{
        Thread.sleep(1000);
        return serverPort;
    }


    @PostMapping("/payment/create")
    public CommonResult create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        if(result > 0) {
            return new CommonResult(200, "插入成功", result);
        } else {
            return new CommonResult(500, "插入失败", null);
        }
    }

}
