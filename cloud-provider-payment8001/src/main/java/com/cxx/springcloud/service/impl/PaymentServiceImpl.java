package com.cxx.springcloud.service.impl;

import com.cxx.springcloud.observer.Payment;
import com.cxx.springcloud.dao.PaymentDao;
import com.cxx.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentDao paymentDao;


    @Override
    public List<Payment> getPayments() {
        List<Payment> list = paymentDao.getPayments();
        return list;
    }

    @Override
    public Payment getPaymentById(Integer id) {
        return paymentDao.getPaymentById(id);
    }

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }
}
