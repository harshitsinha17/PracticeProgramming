package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class ServiceClass {

	public String returnString() {
		return new String("Harshit");
	}
	
	public void conv() {
		System.out.println("Inside Service class conv");
	}
}
