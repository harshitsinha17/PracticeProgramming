package com.altran.catalouge.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.altran.catalouge.model.Seller;

@Repository
public interface SellerRepository extends CrudRepository<Seller, Integer> {
	
	@Query("SELECT p FROM Seller p WHERE p.seller = :seller AND p.prodId = :prodId")
	List<Seller> findBySellerAndProdId(@Param(value = "seller") String seller, @Param(value = "prodId") Integer prodId);
	
	@Query("SELECT p FROM Seller p WHERE p.prodId = :prodId")
	List<Seller> findByProdId(@Param(value = "prodId") Integer prodId);

}
