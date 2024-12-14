package com.query.hint.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.query.hint.entity.Employee;
import com.query.hint.repository.EmployeeRepository;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    public Long fetchEmployees(){
        return repository.count();
    }

    public List<Employee> getEmployeesBySalary(double salary){
        return repository.findEmployeesWithSalaryGreaterThan(salary);
    }

    public List<Employee> getAllEmployees(double salary){
        return repository.findAllEmployees(salary);
    }
}
