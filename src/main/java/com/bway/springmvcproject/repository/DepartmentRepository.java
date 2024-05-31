package com.bway.springmvcproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bway.springmvcproject.model.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {
	

}
