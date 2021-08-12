package com.agency04.sbss.pizza.pizzeria;

import org.springframework.stereotype.Service;

//@Service
public class PizzeriaDetails {
    private String name;
    private String address;

    public PizzeriaDetails() {}

    public String getName() { return name; }
    public String getAddress() { return address; }
    public void setName(String name) { this.name = name; }
    public void setAddress(String address) { this.address = address; }

}
