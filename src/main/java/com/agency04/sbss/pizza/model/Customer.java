package com.agency04.sbss.pizza.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "customer")
public class Customer
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "username")
    private String username;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "customerDetails_id", referencedColumnName = "id")
    private CustomerDetails customerDetails;

    @OneToMany(mappedBy = "customer")
    private List<Delivery> deliveries;

    public Customer(int id, String username, CustomerDetails customerDetails){
        this.id=id;
        this.username=username;
        this.customerDetails = customerDetails;
    }
    public Customer() {}


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public CustomerDetails getCustomerDetails() {
        return customerDetails;
    }

    public void setCustomerDetails(CustomerDetails customerDetails) {
        this.customerDetails = customerDetails;
    }

    public List<Delivery> getDeliveries() {
        return deliveries;
    }

    public void setDeliveries(List<Delivery> deliveries) {
        this.deliveries = deliveries;
    }


}
