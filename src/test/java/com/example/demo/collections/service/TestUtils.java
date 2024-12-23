package com.example.demo.collections.service;


import com.example.demo.example.collections.model.Employee;

public class TestUtils {

    public static Employee getEmployee(String name, Integer salary, Integer dep) {
        return new Employee(name, salary, dep);
    }
}
