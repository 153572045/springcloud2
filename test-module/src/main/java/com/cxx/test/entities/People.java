package com.cxx.test.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class People{

    private Integer id;

    private String name;

    private Integer age;
}
