package com.activeshoppe.entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int customerId;
    private String CustomerName;
    private int pointsBalance;
    
    //    @OneToMany(mappedBy = "product")
//    private Set<OrderProduct> orderproduct;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
    
    

    public double getPointsBalance() {
        return pointsBalance;
    }

    public void setPointsBalance(int pointsBalance) {
        this.pointsBalance = pointsBalance;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }

}
