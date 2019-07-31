package com.wb.crud.service;

import java.util.List;
import java.util.Map;

import com.wb.crud.bean.Employee;

public interface EmployeeService {
	
	List<Map<String, Object>> getAllEmps();
	
	int addEmp(Employee employee);
	
}
