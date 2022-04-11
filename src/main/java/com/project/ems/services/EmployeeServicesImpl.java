package com.project.ems.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.ems.entity.Employee;
import com.project.ems.repository.EmployeeRepository;

@Service
public class EmployeeServicesImpl implements EmployeeServices{

	@Autowired
	private EmployeeRepository employeeRepository;
	
	//search all employee
	public List<Employee> findAllEmployees() {
		return employeeRepository.findAll();
	}

	//search employee by empId
	public Employee findEmpByID(int empID) {
		return employeeRepository.findById(empID).get();
	}

	//save new employee
	public Employee saveNewEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	//update existing employee by id
	public Employee updateEmployee(Employee employee, int empID) {
		Employee emp = employeeRepository.findById(empID).get();
		if(emp.getEmpId()==empID) {
			emp.setEmpName(employee.getEmpName());
			emp.setEmpEmail(employee.getEmpEmail());
			emp.setEmpAddress(employee.getEmpAddress());
			emp.setEmpPhone(employee.getEmpPhone());
		}		
		return employeeRepository.save(emp);
	}

	//delete employee by id
	public Employee deleteEmployee(int empID) {
		Employee emp = employeeRepository.findById(empID).get();
		if(emp.getEmpId()==empID) {
			employeeRepository.delete(emp);
		}
		return emp;
	}

	//search by emailId
	public Employee findEmpByEmail(String empEmailId) {
		return employeeRepository.findByEmpEmail(empEmailId);
	}

	//search by phone no
	public Employee findEmpByPhoneNo(String empPhoneNumber) {
		return employeeRepository.findByEmpPhone(empPhoneNumber);
	}

}
