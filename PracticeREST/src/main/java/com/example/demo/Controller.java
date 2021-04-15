package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/home/")
public class Controller {
	
	@RequestMapping(value= "students/{studentId}", method = RequestMethod.GET, produces = "application/json" )
	@ResponseStatus(value = HttpStatus.OK)
	public Student getStudent(@PathVariable(value = "studentId")final int studentId) {
		
		Map<Integer, Student> st = new HashMap<>();
				st.put(1, new Student(1,"H") );
				st.put(2, new Student(2, "A") );
				st.put(3, new Student(3,"R") );
				
		if (st.containsKey(studentId)) {
			return st.get(studentId);
		}
				
		return new Student(4, "S");
		
	}
	
	@RequestMapping(value="students/", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	@ResponseStatus(value = HttpStatus.CREATED)
	public Map<Integer, Student> postStudent(@RequestBody final Student stud){
		Map<Integer, Student> st = new HashMap<>();
		st.put(2, stud);
		
		return st;
	}
	
	
	@RequestMapping(value = "students/{studentId}", method = RequestMethod.PATCH)
	@ResponseStatus(value = HttpStatus.OK)
	public HttpStatus patchStudent(@PathVariable(value = "studentId") final int studentId, @RequestBody final Student obj) {
		return HttpStatus.OK;
	}

}
