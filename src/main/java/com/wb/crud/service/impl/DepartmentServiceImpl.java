package com.wb.crud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wb.crud.bean.Department;
import com.wb.crud.mapper.DepartmentMapper;
import com.wb.crud.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentMapper departmentMapper;
	
	@Override
	public List<Department> getAlldDepts() {
		return departmentMapper.selectByExample(null);
	}

}
