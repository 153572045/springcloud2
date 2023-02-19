package com.cxx.springcloud.springcloud.dao;

import com.cxx.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PaymentDao {

    List<Payment> getPayments();

    int create(Payment payment);

    Payment getPaymentById(@Param("id") Integer id);
}
