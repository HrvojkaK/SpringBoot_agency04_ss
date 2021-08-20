package com.agency04.sbss.pizza.form;

import com.agency04.sbss.pizza.model.Customer;
import com.agency04.sbss.pizza.model.PizzaOrder;

public class DeliveryOrderForm {
    private Customer customer;
    PizzaOrder pizzaOrder;
    private int quantity;
    private String pizza;
    private String size;

    public DeliveryOrderForm(){}

    public DeliveryOrderForm(PizzaOrder pizzaOrder, Customer customer) {
        this.customer = customer;
        this.pizzaOrder = pizzaOrder;
        this.quantity = quantity;
        this.pizza = pizza;
        this.size = size;
    }

    public String getPizza(){ return this.pizza; }
    public void setPizza(String pizza) { this.pizza = pizza;}
    public String getSize(){ return this.size; }//
    public void setSize(String size) { this.size = size;}
    public int getQuantity(){ return this.quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity;}//
    public PizzaOrder getPizzaOrder() { return pizzaOrder; }
    public void setPizzaOrder(PizzaOrder pizzaOrder) { this.pizzaOrder = pizzaOrder; }
    public Customer getCustomer() { return customer; }
    public void setCustomer(Customer customer) { this.customer = customer; }

}

