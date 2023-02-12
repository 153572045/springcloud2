package com.cxx.test.entities.mapper;

import com.cxx.test.entities.People;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PeopleStorage {
    List<People> getPeoples();
}
