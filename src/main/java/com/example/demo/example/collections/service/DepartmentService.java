package com.example.demo.example.collections.service;

import com.example.demo.example.collections.model.Employee;

import java.util.List;
import java.util.Map;

public interface DepartmentService {
    List<Employee> getEmployeesByDepartmentId(int departmentId);

    int getSalarySumByDepartmentId(int departmentId);

    int getMaxSalaryByDepartmentId(int departmentId);

    int getMinSalaryByDepartmentId(int departmentId);

    Map<Integer, List<Employee>> getAllEmployeesByDepartment();
}