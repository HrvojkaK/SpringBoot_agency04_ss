package com.agency04.sbss.pizza.service;

import com.agency04.sbss.pizza.exception.CustomerNotFoundException;
import com.agency04.sbss.pizza.model.Customer;
import com.agency04.sbss.pizza.model.Delivery;
import com.agency04.sbss.pizza.repository.CustomerRepository;
import com.agency04.sbss.pizza.repository.DeliveryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class DeliveryService {
    @Autowired
    private CustomerService customerService;

    @Autowired
    private PizzeriaService pizzeriaService;

    @Autowired
    private DeliveryRepository deliveryRepository;

    @Autowired
    private CustomerRepository customerRepository;


    public List<Delivery> get(){
        return deliveryRepository.findAll();
    }


    public String makeOrder(Delivery delivery) {
        Customer customer = customerRepository.getById(delivery.getCustomer().getId());
        if (customer!=null) {
            delivery.setCustomer(customer);
            deliveryRepository.save(delivery);
            return "Delivery received!";
        }
        throw new CustomerNotFoundException("Customer not found!");
    }
}
