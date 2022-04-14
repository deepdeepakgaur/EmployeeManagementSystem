package com.project.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.ems.entity.Salary;

@Repository
public interface SalaryRepository extends JpaRepository<Salary, Integer>{

}
