package com.ashokit.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.entity.Employee;

public interface EmployeeRepository  extends JpaRepository<Employee,  Serializable>{

}
