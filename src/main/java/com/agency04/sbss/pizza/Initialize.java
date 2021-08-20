package com.agency04.sbss.pizza;


import com.agency04.sbss.pizza.model.*;
import com.agency04.sbss.pizza.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class Initialize implements ApplicationRunner {

    @Autowired
    private final CustomerRepository customerRepository;
    private final CustomerDetailsRepository customerDetailsRepository;
    private final DeliveryRepository deliveryRepository;
    private final PizzaRepository pizzaRepository;
    private final PizzaOrderRepository pizzaOrderRepository;

    public Initialize(CustomerRepository customerRepository, CustomerDetailsRepository customerDetailsRepository, DeliveryRepository deliveryRepository, PizzaRepository pizzaRepository, PizzaOrderRepository pizzaOrderRepository) {
        this.customerRepository = customerRepository;
        this.customerDetailsRepository = customerDetailsRepository;
        this.deliveryRepository = deliveryRepository;
        this.pizzaRepository = pizzaRepository;
        this.pizzaOrderRepository = pizzaOrderRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

    //    CustomerDetails customerDetails =customerDetailsRepository.save(new CustomerDetails(1, "Marko", "Mar", "12345"));
      //  CustomerDetails customerDetails =new CustomerDetails(1,"Marko", "Mar", "12345");

//        customerRepository.save(new Customer(1,"MM", null));//customerDetails));
    }
}