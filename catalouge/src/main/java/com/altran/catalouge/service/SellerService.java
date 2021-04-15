package com.altran.catalouge.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.altran.catalouge.model.Seller;
import com.altran.catalouge.repository.SellerRepository;

@Service
public class SellerService {

	@Autowired
	private SellerRepository sellerRepo;
	
	public List<Seller> getAll() {
		List<Seller> allSeller = new ArrayList<>(); 
		sellerRepo.findAll().forEach(allSeller::add);
		return allSeller;
	}
	
	public void createSeller(Seller seller) {
		// check if there is record for same seller and same product id
		sellerRepo.save(seller);
	}

	public void deleteSeller(int id) {
		sellerRepo.deleteById(id);
	}

	public List<Seller> getAllSellerWithProdId(int prodId) {
		return sellerRepo.findByProdId(prodId);
	}
	
	public List<Seller> getAllSellerBySellerAndProdId(String seller, int prodId) {
		return sellerRepo.findBySellerAndProdId(seller, prodId);
	}
}
