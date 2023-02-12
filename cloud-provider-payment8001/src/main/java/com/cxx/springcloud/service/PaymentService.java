package com.cxx.springcloud.service;

import com.cxx.springcloud.entities.Payment;

import java.util.List;

public interface PaymentService {

    List<Payment> getPayments();

    Payment getPaymentById(Integer id);

    int create(Payment payment);
}
