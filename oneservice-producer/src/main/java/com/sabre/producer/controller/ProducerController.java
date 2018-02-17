package com.sabre.producer.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sabre.producer.model.Employee;

@RestController
@EnableAutoConfiguration
public class ProducerController {

	@RequestMapping(value = "/employee", method = RequestMethod.GET)
	public Employee getEmployee() {
		Employee emp = new Employee();
		emp.setName("emp1");
		emp.setDesignation("manager");
		emp.setEmpId("1");
		emp.setSalary(3000);

		return emp;
	}

}
