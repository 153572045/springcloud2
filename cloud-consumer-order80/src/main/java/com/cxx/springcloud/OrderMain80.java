package com.cxx.springcloud;

import com.cxx.myrule.CustomLoadBalancerClientConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;

@SpringBootApplication
//@RibbonClient(name = "CLOUD-PAYMENT-SERVICE", configuration = MySelfRule.class)
@LoadBalancerClient(name = "CLOUD-PAYMENT-SERVICE", configuration = CustomLoadBalancerClientConfiguration.class)
public class OrderMain80 {
    public static void main(String[] args) {
        org.springframework.boot.SpringApplication.run(OrderMain80.class, args);
    }
}
