package com.ordinner.backend.model;

import javax.persistence.*;
import java.util.List;
@Entity
@Table (name = "Order")
public class Order {
    @Id @GeneratedValue
    @Column(name = "id")
    private Integer id;
    @Column(name = "customer")
    private User customer;
    @Column(name = "order")
    private List<Food> order;

    public Order(Integer orderId, User customer, List<Food> order) {
        this.id = orderId;
        this.customer = customer;
        this.order = order;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getCustomer() {
        return customer;
    }

    public void setCustomer(User customer) {
        this.customer = customer;
    }

    public List<Food> getOrder() {
        return order;
    }

    public void setOrder(List<Food> order) {
        this.order = order;
    }
}
