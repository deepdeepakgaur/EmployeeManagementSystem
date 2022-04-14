package com.project.ems.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.ems.entity.Employee;
import com.project.ems.repository.EmployeeRepository;
import com.project.ems.repository.SalaryRepository;

@Service
public class EmployeeServicesImpl implements EmployeeServices{

	@Autowired
	private EmployeeRepository employeeRepository;
	@Autowired
	private SalaryRepository salaryRepository;
	
	//search all employee
	public List<Employee> findAllEmployees() {
		List<Employee> empList = null;
		try {
			empList = employeeRepository.findAll();
		} catch (Exception e) { 
			e.printStackTrace();
		}
		return empList;
	}

	//search employee by empId
	public Employee findEmpByID(int empID) {
		Employee emp = null;
		try {
			emp = employeeRepository.findById(empID).get();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return emp;
	}

	//save new employee
	public Employee saveNewEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	//update existing employee by id
	public Employee updateEmployee(Employee employee, int empID) {
		Employee emp = null;
		try {
			emp = employeeRepository.findById(empID).get();
			if(emp.getEmpId()==empID) {
				emp.setEmpName(employee.getEmpName());
				emp.setEmpEmail(employee.getEmpEmail());
				emp.setEmpAddress(employee.getEmpAddress());
				emp.setEmpPhone(employee.getEmpPhone());
				emp.setDepartment(employee.getDepartment());
				emp.setSalary(employee.getSalary());
			}
			employeeRepository.save(emp);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return emp;
	}

	//delete employee by id
	public Employee deleteEmployee(int empID) {
		Employee emp = null;
		try {
			emp =  employeeRepository.findById(empID).get();
			if(emp.getEmpId()==empID) {
				
				employeeRepository.delete(emp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return emp;
	}

	//search by emailId
	public Employee findEmpByEmail(String empEmailId) {
		Employee emp = null;
		try {
			emp = employeeRepository.findByEmpEmail(empEmailId);                    
		} catch (Exception e) {
			e.printStackTrace();
		}
		return emp;
	}

	//search by phone no
	public Employee findEmpByPhoneNo(String empPhoneNumber) {
		Employee emp = null;
		try {
			emp = employeeRepository.findByEmpPhone(empPhoneNumber);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return emp;
	}

}
