package com.project.ems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.project.ems.entity.Employee;
import com.project.ems.services.EmployeeServices;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeServices employeeServices;
	
	@GetMapping("employee")
	public List<Employee> getAllEmployee(){
		return employeeServices.findAllEmployees();
	}
	
	@PostMapping("employee")
	public Employee saveNewEmployee(@RequestBody Employee employee){
		return employeeServices.saveNewEmployee(employee);
	}
	
	@GetMapping("employee/email/{empEmail}")
	public Employee getEmployeeByEmail(@PathVariable ("empEmail") String empEmail){
		return employeeServices.findEmpByEmail(empEmail);
	}
	
	@GetMapping("employee/phone/{empPhone}")
	public Employee getEmployeeByPhone(@PathVariable ("empPhone") String empPhone){
		return employeeServices.findEmpByPhoneNo(empPhone);
	}
	
	@GetMapping("employee/{empId}")
	public Employee getEmployeeById(@PathVariable ("empId") int empId){
		return employeeServices.findEmpByID(empId);
	}
	
	@PutMapping("employee/{empId}")
	public Employee updateEmployeeById(@PathVariable ("empId") int empId, @RequestBody Employee employee){
		return employeeServices.updateEmployee(employee, empId);
	}
	
	@DeleteMapping("employee/{empId}")
	public Employee deleteEmployeeById(@PathVariable ("empId") int empId){
		return employeeServices.deleteEmployee(empId);
	}
}
