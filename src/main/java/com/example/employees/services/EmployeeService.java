package com.example.employees.services;

import com.example.employees.entity.Employees;
import com.example.employees.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;
    public Employees saveEmployee(Employees emp ){
        return this.employeeRepository.save(emp);
    }

}
