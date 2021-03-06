package com.activeshoppe.services;

import com.activeshoppe.entities.Product;

import java.util.List;

public interface ProductService {
    List<Product> listAllProducts();

    Product getProductById(Integer id);

    Product saveProduct(Product product);

    void deleteProduct(Integer id);

}
