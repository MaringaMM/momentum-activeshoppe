package com.activeshoppe.controllers;

import com.activeshoppe.services.ProductService;
import com.activeshoppe.entities.Product;
import com.activeshoppe.services.CustomerService;
import com.activeshoppe.services.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CustomerController {

    private CustomerService customerService;

    @Autowired
    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }

    @RequestMapping(value = "/customer", method = RequestMethod.GET)
    public String list(Model model){
        model.addAttribute("customer", customerService.listAllCustomers());
        System.out.println("Returning customer:");
        return "customer";
    }

    @RequestMapping("customer/{id}")
    public String showCustomer(@PathVariable Integer id, Model model){
        model.addAttribute("customer", customerService.getCustomerById(id));
        return "customershow";
    }

    @RequestMapping("customer/edit/{id}")
    public String edit(@PathVariable Integer id, Model model){
        model.addAttribute("customer", customerService.getCustomerById(id));
        return "customerform";
    }

    @RequestMapping("customer/new")
    public String newProduct(Model model){
        model.addAttribute("customer", new Product());
        return "customerform";
    }

//    @RequestMapping(value = "product", method = RequestMethod.POST)
//    public String saveProduct(Product product){
//        productService.saveProduct(product);
//        return "redirect:/product/" + product.getId();
//    }

    @RequestMapping("customer/delete/{id}")
    public String delete(@PathVariable Integer id){
        customerService.deleteCustomer(id);
        return "redirect:/customerS";
    }

}
