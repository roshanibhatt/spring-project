package com.bway.springmvcproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.bway.springmvcproject.model.Department;
import com.bway.springmvcproject.service.DepartmentService;
import com.bway.springmvcproject.service.EmployeeService;

import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class DepartmentController {
	@Autowired
	private DepartmentService deptService;


	@GetMapping("/department")
	public String getDepartment() {

		return "DepartmentForm";
	}

	@PostMapping("/department")
	public String postDepartment(@ModelAttribute Department dept) {
		deptService.addDept(dept);
		return "DepartmentForm";
	}
	@GetMapping("/departmentlist")
	public String getAll( Model model) {
		model.addAttribute("dlist",deptService.getAllDepts());
	
		return "DepartmentListForm";
	}
	
	@GetMapping("/dept/delete")
	public String delete(@RequestParam int id) {
		
		deptService.deleteDept(id);
		return "redirect:/departmentlist";
	}
	@GetMapping("/dept/edit")
	public String edit(@RequestParam int id, Model model) {
		
		model.addAttribute("dmodel",deptService.getById(id));
		return"DepartmentEditForm1";
	}
	@PostMapping("/dept/update")
	public String update(@ModelAttribute Department dept) {
		deptService.updateDept(dept);
		
		return "redirect:/departmentlist";
	}
	
	
}
