package com.altran.catalouge.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.altran.catalouge.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository prodRepo;
	
	

}
