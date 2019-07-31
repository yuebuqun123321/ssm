package com.wb.crud.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wb.crud.bean.Department;
import com.wb.crud.bean.Employee;
import com.wb.crud.service.DepartmentService;
import com.wb.crud.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@Autowired
	private DepartmentService departmentService;
	
	@RequestMapping("/getAllEmps")
	public String getAllEmps(Map<String, Object> map) {
		List<Map<String,Object>> emps = employeeService.getAllEmps();
		map.put("emps", emps);
		return "index";
	}
	
	@RequestMapping("/toAddPage")
	public String toAddPage(Map<String, Object> map) {
		List<Department> depts = departmentService.getAlldDepts();
		map.put("depts", depts);
		return "addEmp";
	}
	
	@RequestMapping(value = "/addEmp", method = RequestMethod.POST)
	public String addEmp(Employee employee) {
		System.out.println(employee);
		employeeService.addEmp(employee);
		return "redirect:/getAllEmps";
	}
	
}
