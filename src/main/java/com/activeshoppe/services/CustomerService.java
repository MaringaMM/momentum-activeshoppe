package com.activeshoppe.services;

import com.activeshoppe.entities.Customer;
import com.activeshoppe.entities.Product;

import java.util.List;

public interface CustomerService {
    List<Customer> listAllCustomers();

    Customer getCustomerById(Integer id);

    Customer saveCustomer(Customer customer);

    void deleteCustomer(Integer customerId);

}