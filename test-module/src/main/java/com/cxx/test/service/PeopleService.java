package com.cxx.test.service;

import com.cxx.test.entities.People;
import com.cxx.test.entities.mapper.PeopleStorage;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeopleService {

    @Resource
    private PeopleStorage peopleStorage;

    public List<People> findPeoples() {
        List<People> result = peopleStorage.getPeoples();
        return result;
    }
}
