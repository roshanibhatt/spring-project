package com.bway.springmvcproject.service;

import java.util.List;

import com.bway.springmvcproject.model.Department;

public interface DepartmentService {
	void addDept(Department dept);

	void deleteDept(int id);

	void updateDept(Department dept);

	Department getById(int id);

	List<Department> getAllDepts();

}
