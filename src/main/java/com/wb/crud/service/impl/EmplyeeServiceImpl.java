package com.wb.crud.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wb.crud.bean.Employee;
import com.wb.crud.mapper.EmployeeMapper;
import com.wb.crud.service.EmployeeService;

@Service
public class EmplyeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeMapper employeeMapper;
	
	@Override
	public List<Map<String, Object>> getAllEmps() {
		return employeeMapper.getEmpsList();
	}

	@Override
	public int addEmp(Employee employee) {
		return employeeMapper.insertSelective(employee);
	}

}
