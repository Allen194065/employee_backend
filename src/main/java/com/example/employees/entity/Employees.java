package com.example.employees.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Employees {
    @Id
    int emp_id;
    String name;
    String phone_no;
    @ManyToOne
    @JoinColumn(name = "dept_id")
    @JsonBackReference
    Departments department;

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }

    public Departments getDepartment() {
        return department;
    }

    public void setDepartment(Departments department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "emp_id=" + emp_id +
                ", name='" + name + '\'' +
                ", phone_no='" + phone_no + '\'' +
                ", department=" + department +
                '}';
    }
}
