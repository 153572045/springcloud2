package com.cxx.springcloud.observer;

import com.cxx.springcloud.observer.Publisher;
import org.springframework.stereotype.Component;

@Component
public class OrderPublisher extends Publisher {


    public void order() {
        notifyAllObservers();
    }
}
