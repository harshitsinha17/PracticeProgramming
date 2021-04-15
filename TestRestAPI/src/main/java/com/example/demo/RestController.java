package com.example.demo;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	@org.springframework.web.bind.annotation.RestController
	public class WebController {

		@RequestMapping(method = RequestMethod.GET, value="/sample", produces = "application/json")
		public ResponseEntity<SampleResponse> Sample() {
			SampleResponse response = new SampleResponse();
			response.setId(1);
			//response.setName("Your name is "+name);
			System.out.println(response.findall());
			return new ResponseEntity<>(response.findall().get(1), HttpStatus.OK);
			//return response.findall().get(1);

		}
	}
}
