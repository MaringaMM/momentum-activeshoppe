package com.activeshoppe.repositories;

import com.activeshoppe.entities.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("productRepository") //ADDED
public interface ProductRepository extends CrudRepository<Product, Integer>{
}
