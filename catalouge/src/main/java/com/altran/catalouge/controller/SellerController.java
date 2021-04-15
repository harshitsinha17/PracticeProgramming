package com.altran.catalouge.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.altran.catalouge.model.Seller;
import com.altran.catalouge.service.SellerService;


@RestController
@RequestMapping(value = "/api/v1/seller")
public class SellerController {
	
	@Autowired
	private SellerService sellerService;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Seller> getAll() {
		return sellerService.getAll();
	}
	
	@RequestMapping(value = "/getByProdId/{prodId}", method = RequestMethod.GET)
	public List<Seller> getAllSellerWithProdId(@PathVariable("prodId") int prodId) {
		return sellerService.getAllSellerWithProdId(prodId);
	}
	
	@RequestMapping(value = "/{seller}/{prodId}", method = RequestMethod.GET)
	public List<Seller> getAllSellerBySellerAndProdId(@PathVariable("seller") String seller, @PathVariable("prodId") int prodId) {
		return sellerService.getAllSellerBySellerAndProdId(seller, prodId);
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Seller createSeller(@RequestBody Seller seller) {
		sellerService.createSeller(seller);
		return seller;
	}
	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public void deleteSeller(@PathVariable("id") int id) {
		sellerService.deleteSeller(id);
	}
}
