package com.bridgelabz.employeepayrollapp.dto;

public class EmployeePayrollDTO {
    public String name;
    public long salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmployeePayrollDTO{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public EmployeePayrollDTO(String name, long salary) {

                }
    }
