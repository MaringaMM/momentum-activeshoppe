package com.activeshoppe.entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int productId;
    private String productName;
    private int pointsCost;

//    @OneToMany(mappedBy = "product")
//    private Set<OrderProduct> orderproduct;

    public String getProductName() {return productName;}

    public void setProductName(String productName) {this.productName = productName;}
    
    public int getProductId() {return productId;}

    public void setProductId(int productId) {this.productId = productId;}

    public int getPointsCost() {return pointsCost;}

    public void setPointsCost(int pointsCost) {this.pointsCost = pointsCost;}

//    public Set<OrderProduct> getOrderProduct() {return orderproduct;}
//
//    public void setOrderProduct(Set<OrderProduct> orderproduct) {this.orderproduct = orderproduct;}
}
