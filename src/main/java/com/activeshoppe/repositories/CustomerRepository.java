/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.activeshoppe.repositories;
import com.activeshoppe.entities.Customer;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author MusaM
 */
@Repository("customerRepository")
public interface CustomerRepository extends CrudRepository<Customer, Integer> {
}
