package com.agency04.sbss.pizza.service;

import com.agency04.sbss.pizza.model.Customer;
import com.agency04.sbss.pizza.exception.CustomerNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CustomerService {

    public List<Customer> customers = new ArrayList<>(Arrays.asList(
            new Customer("Marko1", "Marko","Horvat"),
            new Customer("Ana1", "Ana","Kovac")));


    public Customer getSingleCustomer(String username) {
        for (Customer customer : customers) {
            if (customer.getUsername().equals(username)) {
                return customer;
            }
            else{ throw new CustomerNotFoundException("Customer with this username does not exist."); }
        }
        return null;
    }

    public String addCustomer(Customer customer) {
        this.customers.add(customer);
        return "Created account";
    }

    public String updateCustomer(Customer thecustomer) {
        String theusername = thecustomer.getUsername();
        for (Customer customer : customers) {
            if (customer.getUsername().equals(theusername)) {
                customer.setFirstName(thecustomer.getFirstName());
                customer.setLastName(thecustomer.getLastName());
                return "Customer updated";
            }
        }
        return "Customer with such username not found";
    }

    public String deleteCustomer(String username) {
        for(Customer customer: customers) {
            if(customer.getUsername().equals(username)){
                customers.remove(customer);
                return "Deleted";
            }
        }
        return "This username does not exist";
    }


}
