package com.bridgelabz.employeepayrollapp.services;

import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollapp.model.EmployeePayrollData;

import java.util.List;

public interface IEmployeePayrollService {

    List<EmployeePayrollData> getEmployeePayrollData();

    EmployeePayrollData getEmployeePayrollDataById(int empId);

    EmployeePayrollData createEmplyeePayrollData(EmployeePayrollDTO empPayrollDTO);

    EmployeePayrollDTO updateEmployeePayrollData(EmployeePayrollDTO empPayrollDTO);

    void deleteEmployeePayrollData(int empId);

}
