package com.project.ems.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	public ResponseEntity<List<Employee>> getAllEmployee(){
		List<Employee> empList = employeeServices.findAllEmployees();
		if(empList.size()< 1) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(empList));
	}
	
	@PostMapping("employee")
	public Employee saveNewEmployee(@RequestBody Employee employee){
		return employeeServices.saveNewEmployee(employee);
	}
	
	@GetMapping("employee/email/{empEmail}")
	public ResponseEntity<Employee> getEmployeeByEmail(@PathVariable ("empEmail") String empEmail){
		Employee emp = employeeServices.findEmpByEmail(empEmail);
		if(emp==null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(emp));
	}
	
	@GetMapping("employee/phone/{empPhone}")
	public ResponseEntity<Employee> getEmployeeByPhone(@PathVariable ("empPhone") String empPhone){
		Employee emp = employeeServices.findEmpByPhoneNo(empPhone);
		if(emp==null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(emp));
	}
	
	@GetMapping("employee/{empId}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable ("empId") int empId){
		Employee emp = employeeServices.findEmpByID(empId);
		if(emp==null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(emp));
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
