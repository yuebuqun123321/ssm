package com.wb.crud.test;

import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.wb.crud.service.EmployeeService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-context.xml")
public class SpringTest {

//	ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-context.xml");
	
	@Autowired
	private EmployeeService employeeService;
	
	@Test
	public void test() {
//		EmployeeService bean = (EmployeeService) ioc.getBean("emplyeeServiceImpl");
//		List<Map<String,Object>> list = bean.getAllEmps();
//		list.stream().forEach(System.out::println);
	}
	
	@Test
	public void test2() {
		System.out.println(employeeService);
		List<Map<String,Object>> list = employeeService.getAllEmps();
		System.out.println(list);
	}
	
}
