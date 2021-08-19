package com.agency04.sbss.pizza.service;

import com.agency04.sbss.pizza.model.Customer;
import com.agency04.sbss.pizza.repository.CustomerRepository;
import com.agency04.sbss.pizza.exception.CustomerNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {
    private CustomerRepository customerRepository;

    public CustomerService(CustomerRepository theCustomerRepository) {
        customerRepository = theCustomerRepository;
    }

    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    public Customer findById(int theId) {
        Optional<Customer> customer = customerRepository.findById(theId);
        if (!customer.isPresent()) {
            throw new CustomerNotFoundException("No such id");
        }
        return customer.get();
    }

    public void save(Customer theCustomer) {
        customerRepository.save(theCustomer);
    }

    public void deleteById(int theId) {
        customerRepository.deleteById(theId);
    }

}

