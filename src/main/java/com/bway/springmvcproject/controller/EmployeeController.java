package com.bway.springmvcproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bway.springmvcproject.model.Employee;
import com.bway.springmvcproject.service.DepartmentService;
import com.bway.springmvcproject.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService empService;
	@Autowired
	private DepartmentService deptService;

	@GetMapping("/employee")
	public String getEmployee(Model model) {
		model.addAttribute("dlist", deptService.getAllDepts());
		return "EmployeeForm";
	}

	@PostMapping("/employee")
	public String postEmployee(@ModelAttribute Employee emp) {

		empService.addEmployee(emp);
		return "EmployeeForm";

	}

	@GetMapping("employeelist")
	public String getAllEmp(Model model) {

		model.addAttribute("elist", empService.getAllEmployee());
		return "EmployeeList";

	}

	@GetMapping("emp/delete")
	public String deleteEmployee(@RequestParam Long id) {
		empService.deleteEmployee(id);
		return "redirect:/employeelist";
	}
	@GetMapping("/emp/edit")
	public String editEmployee(@RequestParam Long id,Model model) {
		
		model.addAttribute("emodel",empService.getEmployeeById(id));
		model.addAttribute("dlist",deptService.getAllDepts());
		
		return"EmployeeEditForm";
	}
	@PostMapping("/emp/update")
     public String Update(@ModelAttribute Employee emp) {
    	 
    	 empService.updateEmployee(emp);
    	 
    	 return"redirect:/employeelist";
    	 		
     }
	@GetMapping("/emp/view")
    public String view(@RequestParam Long id,Model model) {
		model.addAttribute("dlist",deptService.getAllDepts());
    	model.addAttribute("emodel",empService.getEmployeeById(id));
    	return "ViewForm";
    }
	@GetMapping("/back")
	public String Back() {
		return "redirect:/employeelist";
	}
	
	
}
