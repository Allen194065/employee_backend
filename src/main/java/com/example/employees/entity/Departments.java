package com.example.employees.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Departments {
    @Id
    int dept_id;
    String dept_name;
    int manager_id;
    @OneToMany(mappedBy = "department")
    @JsonManagedReference
    List<Employees> employees;

    public int getDept_id() {
        return dept_id;
    }

    public void setDept_id(int dept_id) {
        this.dept_id = dept_id;
    }

    public String getDept_name() {
        return dept_name;
    }

    public void setDept_name(String dept_name) {
        this.dept_name = dept_name;
    }

    public int getManager_id() {
        return manager_id;
    }

    public void setManager_id(int manager_id) {
        this.manager_id = manager_id;
    }

    public List<Employees> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employees> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Departments{" +
                "dept_id=" + dept_id +
                ", dept_name='" + dept_name + '\'' +
                ", manager_id=" + manager_id +
                ", employees=" + employees +
                '}';
    }
}

