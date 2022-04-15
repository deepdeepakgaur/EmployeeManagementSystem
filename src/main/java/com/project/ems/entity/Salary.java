package com.project.ems.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Salary implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
		
    @OneToOne(fetch = FetchType.LAZY, mappedBy = "salary", optional=true)
    @JoinColumn(name = "empID")
    @JsonBackReference
	private Employee employee;
    
    private int empSalary;
	
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
