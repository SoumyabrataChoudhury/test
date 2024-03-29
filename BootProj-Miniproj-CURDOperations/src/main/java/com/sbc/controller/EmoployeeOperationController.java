package com.sbc.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.sbc.model.Employee;
import com.sbc.service.IEmployeeMgmtService;

@Controller
public class EmoployeeOperationController {

	@Autowired	
	private IEmployeeMgmtService empService;
	
	@GetMapping("/")
	public String showHome() {
		return "home";
	}
	
	@GetMapping("/emp_report")
	public String showEmployeeReport(Map<String,Object>map) {
		//use service
		Iterable<Employee> itEmps= empService.getAllEmployees();
		
		//put Result in model Attribute
		map.put("EmpList",itEmps);
		//return Logical view name(LVN)
		return "show_employee_report";
		
	}
}
