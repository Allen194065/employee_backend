package com.example.employees.services;

import com.example.employees.entity.Departments;
import com.example.employees.repository.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class DeptService {

    @Autowired
    DepartmentRepo departmentRepo;
    public Departments saveDepartment(Departments dept) {
        return this.departmentRepo.save(dept);
    }

    public List<Departments> getAllDepartments() {
        return this.departmentRepo.findAll();
    }
}

//int sum(int a , int b ){}
//
//Departments acc = testing();
// Departments testing(){
//    Departments dep = new Departments();
//    dep.setDept_id(3);
//    dep.setDept_name("english");
//    dep.setManager_id(4);
//    String xyz ="dkdkd";
//
//
//    return dep;
// }