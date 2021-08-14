package com.agency04.sbss.pizza.form;

import com.agency04.sbss.pizza.model.Customer;

public class DeliveryOrderForm {
    private Customer customer;
    private String pizza;
    private String size;
    private int number;

    public DeliveryOrderForm(){}

    public DeliveryOrderForm(Customer customer, String pizza, String size, int number) {
        this.customer = customer;
        this.pizza = pizza;
        this.size = size;
        this.number = number;
    }
    public String getPizza(){ return this.pizza; }
    public void setPizza(String pizza) { this.pizza = pizza;}
    public String getSize(){ return this.size; }
    public void setSize(String size) { this.size = size;}
    public int getNumber(){ return this.number; }
    public void setNumber(int number) { this.number = number;}
    public Customer getCustomer() { return customer; }
    public void setCustomer(Customer customer) { this.customer = customer; }

}
