package com.project.ems.services;

import java.util.List;

import com.project.ems.entity.Employee;

public interface EmployeeServices {	
	List<Employee> findAllEmployees();
	Employee findEmpByID(int empID);
	Employee findEmpByEmail(String empEmailId);
	Employee findEmpByPhoneNo(String empPhoneNumber);
	Employee saveNewEmployee(Employee employee);
	Employee updateEmployee(Employee employee, int empID);
	Employee deleteEmployee(int empID);
}
