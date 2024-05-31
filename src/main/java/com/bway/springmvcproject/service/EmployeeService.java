package com.bway.springmvcproject.service;

import java.util.List;

import com.bway.springmvcproject.model.Employee;

public interface EmployeeService {
	void addEmployee(Employee employee);

	void deleteEmployee(Long empid);

	void updateEmployee(Employee employee);

	Employee getEmployeeById(Long empid);

	List<Employee> getAllEmployee();
}
