package com.activeshoppe.repositories;

import com.activeshoppe.entities.Product;
import org.springframework.data.repository.CrudRepository;


public interface ProductRepository extends CrudRepository<Product, Integer>{
}
