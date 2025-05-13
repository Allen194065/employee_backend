package com.example.employees.controllers;

import com.example.employees.entity.Departments;
import com.example.employees.services.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
public class Department {

    @Autowired
    DeptService deptService;
    @PostMapping("/save")
    public Departments addDepartment(@RequestBody Departments deptPayload ){
        return this.deptService.saveDepartment(deptPayload);
    }
    @GetMapping("/get")
    public List<Departments> getAllDepartments() {
        return this.deptService.getAllDepartments();
    }
}
