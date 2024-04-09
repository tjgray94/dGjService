package com.dGjCreations.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "orders")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int orderId;
    @Column(name = "products")
    private List<String> products;
    @Column(name = "total")
    private double total;
    @Column(name = "name")
    private String name;
    @Column(name = "address")
    private String address;
    @Column(name = "order_time")
    private String orderTime;
    @Column(name = "payment_type")
    private String paymentType;

    public Order(List<String> products, double total, String name, String address, String orderTime, String paymentType) {
        this.products = products;
        this.total = total;
        this.name = name;
        this.address = address;
        this.orderTime = orderTime;
        this.paymentType = paymentType;
    }
}
