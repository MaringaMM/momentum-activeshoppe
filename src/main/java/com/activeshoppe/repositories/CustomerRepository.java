/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.activeshoppe.repositories;


import com.activeshoppe.entities.Customer;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author MusaM
 */
public interface CustomerRepository extends CrudRepository<Customer, Integer> {
}
