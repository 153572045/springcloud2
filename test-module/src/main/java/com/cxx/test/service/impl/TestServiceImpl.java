package com.cxx.test.service.impl;

import com.cxx.test.entities.People;
import com.cxx.test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {
    @Override
    public People getPeople() {
        return new People(1, "xxx", 90);
    }
}
