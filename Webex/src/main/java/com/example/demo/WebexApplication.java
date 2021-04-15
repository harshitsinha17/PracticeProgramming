package com.example.demo;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.boot.SpringApplication;


import org.springframework.boot.autoconfigure.SpringBootApplication;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;


@SpringBootApplication
public class WebexApplication {

	public static void main(String[] args) throws Exception 
	{
		SpringApplication.run(WebexApplication.class, args);
		Date scheduleTime = new Date();
		System.out.println( new SimpleDateFormat("HH").format(new Date()) );
		
		WebexApplication object = new WebexApplication();
		while(true)
		{
			if(19 == Integer.parseInt( new SimpleDateFormat("HH").format(new Date()) ) ) {
				System.out.println("6 pm reached");
				System.exit(1);
			}
			
		    Thread.sleep(500000);
		    object.sendPostRequest();
		}
		
	}
	
	public void sendPostRequest() throws Exception
	{
	    OkHttpClient client = new OkHttpClient().newBuilder()
	            .build();
	          MediaType mediaType = MediaType.parse("application/json");
	          RequestBody body = RequestBody.create(mediaType, "{\r\n  \"roomId\": \"Y2lzY29zcGFyazovL3VzL1JPT00vYjI0ZGQ4NzAtNGIzOC0xMWViLTg1NzEtNzMzYjE0ZmZmN2Nm\",\r\n  \"text\": \"Hello boy\"\r\n}");
	          Request request = new Request.Builder()
	            .url("https://webexapis.com/v1/messages")
	            .method("POST", body)
	            .addHeader("Authorization", "Bearer MjlmZmM3M2YtYWNkOS00NjdiLTliMGMtNjE1NDRkMTFiNDdjM2NkZDBhZjktNzJi_PF84_1eb65fdf-9643-417f-9974-ad72cae0e10f")
	            .addHeader("Content-Type", "application/json")
	            .build();
	          Response response = client.newCall(request).execute();
	          System.out.println(response);
	}

}
