package com.example.employees.controllers;

import com.example.employees.entity.Employees;
import com.example.employees.services.DeptService;
import com.example.employees.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    EmployeeService empService;
    @PostMapping("/save")
    public Employees addEmployee(@RequestBody Employees emp ){
        return this.empService.saveEmployee(emp);
    }
    @GetMapping("/get")
    public String getAllEmployees() {
        return "Get all Employees Details from employee table";
    }
}
