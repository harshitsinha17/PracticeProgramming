package com.altran.catalouge.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.altran.catalouge.model.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {

}
