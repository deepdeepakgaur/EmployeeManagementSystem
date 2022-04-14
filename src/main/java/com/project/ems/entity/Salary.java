package com.project.ems.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Salary {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private int empSalary;
	
    @OneToOne(mappedBy = "salary")
    @JsonBackReference
	private Employee employee;
	
	public Salary() {
		super();
	}

	public Salary(int id, int empSalary, Employee employee) {
		super();
		this.id = id;
		this.empSalary = empSalary;
		this.employee = employee;
	}	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public int getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
}
