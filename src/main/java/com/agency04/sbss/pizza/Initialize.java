package com.agency04.sbss.pizza;


import com.agency04.sbss.pizza.model.*;
import com.agency04.sbss.pizza.model.pizzas.FruttiDiMare;
import com.agency04.sbss.pizza.model.pizzas.Margherita;
import com.agency04.sbss.pizza.model.pizzas.Marinara;
import com.agency04.sbss.pizza.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;


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

        CustomerDetails customerDetails =new CustomerDetails(1,"Marko", "Mar", "12345");
        Customer customer = new Customer();
        customer.setUsername("mm");
        customer.setCustomerDetails(customerDetails);
        customerRepository.save(new Customer(1,"MM", null));

        Pizza pizza = new FruttiDiMare();
        pizzaRepository.save(pizza);
        Pizza pizza2 = new Margherita();
        pizzaRepository.save(pizza2);
        Pizza pizza3 = new Marinara();
        pizzaRepository.save(pizza3);

    }
}