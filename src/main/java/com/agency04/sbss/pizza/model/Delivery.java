package com.agency04.sbss.pizza.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Delivery {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @OneToMany
    @JoinColumn(name = "delivery_id")
    private List<PizzaOrder> pizzaOrders = new ArrayList<>();


    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="customer_id")
    private Customer customer;

    public Delivery(){}


    public Delivery(List<PizzaOrder> pizzaOrders, Customer customer){
        this.pizzaOrders = pizzaOrders;
        this.customer = customer;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }


    public List<PizzaOrder> getPizzaOrders() {
        return pizzaOrders;
    }
    public void setPizzaOrders(List<PizzaOrder> pizzaOrders) {
        this.pizzaOrders = pizzaOrders;
    }

    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}