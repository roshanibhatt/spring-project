package com.bway.springmvcproject.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bway.springmvcproject.model.Department;

import com.bway.springmvcproject.repository.DepartmentRepository;

import com.bway.springmvcproject.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService {
	@Autowired
	private DepartmentRepository deptRepo;

	@Override
	public void addDept(Department dept) {
		deptRepo.save(dept);

	}

	@Override
	public void deleteDept(int empid) {
		deptRepo.deleteById(empid);

	}

	@Override
	public void updateDept(Department dept) {
		deptRepo.save(dept);

	}

	@Override
	public Department getById(int id) {

		return deptRepo.findById(id).get();
	}

	@Override
	public List<Department> getAllDepts() {

		return deptRepo.findAll();
	}

}
