package com.example.demo;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.ResponseBody;

@ResponseBody
public class SampleResponse {

	String name;
	int id;
	
	
	public SampleResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public ArrayList<SampleResponse> findall()
	{
		SampleResponse ob1 = new SampleResponse(1, "Harshit");
		SampleResponse ob2 = new SampleResponse(2, "Sourav");
		SampleResponse ob3 = new SampleResponse(3, "Shubham");
		
		ArrayList<SampleResponse> arl = new ArrayList<SampleResponse>();
		arl.add(ob1);
		arl.add(ob2);
		arl.add(ob3);
		return arl;
	}

	public SampleResponse(int id, String name) {
		super();
		this.name = name;
		this.id = id;
	}

	
	
	
	public SampleResponse(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	public SampleResponse getObj() {
		return this;
	}
	
	public void operation() {

	}
}
