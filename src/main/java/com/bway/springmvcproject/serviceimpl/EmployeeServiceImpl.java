package com.bway.springmvcproject.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bway.springmvcproject.model.Employee;
import com.bway.springmvcproject.repository.EmployeeRepository;
import com.bway.springmvcproject.service.EmployeeService;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository empRepo;

	@Override
	public void addEmployee(Employee employee) {
	empRepo.save(employee);	
		
	}

	@Override
	public void deleteEmployee(Long id) {
		empRepo.deleteById(id);
		
	}

	@Override
	public void updateEmployee(Employee employee) {
		empRepo.save(employee);
		
	}

	@Override
	public Employee getEmployeeById(Long empid) {
		
		return empRepo.findById(empid).get();
	}

	@Override
	public List<Employee> getAllEmployee() {
		
		return empRepo.findAll();
	}

}
