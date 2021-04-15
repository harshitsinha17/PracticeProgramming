package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/home/")
public class StudentController {

	@Autowired
	Student student;
	
	@Autowired
	ServiceClass serviceClass;
	
	
	@RequestMapping(value = "/value", method = RequestMethod.GET, produces = "application/json")
	public String message() {
		System.out.println("Inside controller class");
		student.show();
		
		serviceClass.conv();
		return "Harshit";
	}
}
