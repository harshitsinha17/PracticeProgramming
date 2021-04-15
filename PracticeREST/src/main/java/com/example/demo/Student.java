package com.example.demo;

public class Student {

	int name;
	String studentId;
	
	public Student(int name, String studentId) {
		super();
		this.name = name;
		this.studentId = studentId;
	}
	
	public int getName() {
		return name;
	}
	public void setName(int name) {
		this.name = name;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	
}
