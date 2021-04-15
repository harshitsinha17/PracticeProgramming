package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
/*
@RestController
@RequestMapping(value="/home")
public class Controller {
	@RequestMapping(value="/students/{id}", method=RequestMethod.GET, produces="application/json")
	@ResponseStatus(value=HttpStatus.OK)
	public Student getStudent(@PathVariable(value="id")final int id) {
		
		Student a = new Student(1,"harshit");
		Student b = new Student(2,"Poland");
		
		List<Student>hp = new ArrayList<>();
		hp.add(a);
		hp.add(b);
		
		 for(Student c: hp) { if(c.getId() ==id) { return c; } }
		 
		return new Student(1,"lpppp");
		
		
	}
	
	@RequestMapping(value="/create", produces = "application/json", consumes = "application/json", method = RequestMethod.POST)
	@ResponseStatus(value=HttpStatus.CREATED)
	public List<Student> postStudent(@RequestBody final Student obj) {
		Student a = new Student(1,"harshit");
		Student b = new Student(2,"Poland");
		
		List<Student>hp = new ArrayList<>();
		hp.add(a);
		hp.add(b);
		hp.add(obj);
		
		return hp;
		
	}*/

	@RestController
	@RequestMapping(value="/home")
	public class Controller{
	
		@RequestMapping(value = "/getStudent", method = RequestMethod.GET, produces="application/json")
		public Student getStudent() {
			
			List<Student> arr = new ArrayList<>();
			arr.add(new Student(1, "Harshit"));
			
			return arr.get(0);
		}
		
		

}
