package com.agency04.sbss.pizza.model;


public class Customer {

    private String username;
    private String firstName;
    private String lastName;

    public Customer(){}

    public Customer(String username, String firstName, String lastName) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getUsername(){ return this.username; }
    public void setUsername(String username) { this.username = username;}

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

}
