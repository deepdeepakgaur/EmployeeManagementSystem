
package com.project.ems.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;


@Entity
public class Department implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int departmentId;
	
	private String departmentName;
	
	//@OneToMany(mappedBy = "department")
	
	@OneToMany(mappedBy="department",cascade=CascadeType.ALL, fetch = FetchType.LAZY)
	@JsonBackReference
	private List<Employee> employee=new ArrayList<Employee>();

	public Department() {
		super();
	}

	public Department(int departmentId, String departmentName, List<Employee> employee) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.employee = employee;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}

	
}



//
//package com.project.ems.entity;
//
//import java.io.Serializable;
//import java.util.List;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.OneToMany;
//
//import com.fasterxml.jackson.annotation.JsonBackReference;
//import com.fasterxml.jackson.annotation.JsonManagedReference;
//
//
//@Entity
//public class Department{
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private int departmentId;
//	
//	private String departmentName;
//	
//	@OneToMany(mappedBy = "department")
//	@JsonManagedReference
//	private List<Employee> employee;
//	
//	public Department() {
//		super();
//	}
//
//	public Department(int departmentId, String departmentName, List<Employee> employee) {
//		super();
//		this.departmentId = departmentId;
//		this.departmentName = departmentName;
//		this.employee = employee;
//	}
//
//	public int getDepartmentId() {
//		return departmentId;
//	}
//
//	public void setDepartmentId(int departmentId) {
//		this.departmentId = departmentId;
//	}
//
//	public String getDepartmentName() {
//		return departmentName;
//	}
//
//	public void setDepartmentName(String departmentName) {
//		this.departmentName = departmentName;
//	}
//
//	public List<Employee> getEmployee() {
//		return employee;
//	}
//
//	public void setEmployee(List<Employee> employee) {
//		this.employee = employee;
//	}
//	
//}
//
//
//
//
