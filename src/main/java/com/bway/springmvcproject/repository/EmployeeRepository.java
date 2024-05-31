package com.bway.springmvcproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bway.springmvcproject.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
