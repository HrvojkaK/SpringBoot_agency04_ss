package com.agency04.sbss.pizza.service;

import com.agency04.sbss.pizza.exception.CustomerNotFoundException;
import com.agency04.sbss.pizza.exception.PizzaNotFoundException;
import com.agency04.sbss.pizza.form.DeliveryOrderForm;
import com.agency04.sbss.pizza.model.Customer;
import com.agency04.sbss.pizza.model.Delivery;
import com.agency04.sbss.pizza.model.PizzaOrder;
import com.agency04.sbss.pizza.repository.CustomerRepository;
import com.agency04.sbss.pizza.repository.DeliveryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
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

    private List<String> availablePizza = Arrays.asList("Margherita", "Marinara", "Frutti di Mare");
    private List<PizzaOrder> pizzaOrders = new ArrayList<>();



    public List<Delivery> get(){
        return deliveryRepository.findAll();
    }


    public String makeOrder(DeliveryOrderForm deliveryOrderForm) {
        //
//       public void addDeliveryOrderForm(DeliveryOrderForm deliveryOrderForm) {
//            if(!availablePizza.contains(deliveryOrderForm.getPizza()) {
//                throw new PizzaNotFoundException("Invalid order. Pizzas available: " +availablePizza);
//            }
//            else{
        this.pizzaOrders.add(deliveryOrderForm.getPizzaOrder());
        //           }

        Customer customer = customerRepository.getById(deliveryOrderForm.getCustomer().getId());
        if (customer!=null) {
            deliveryOrderForm.setCustomer(customer);

            deliveryRepository.save(new Delivery(pizzaOrders,customer));
            return "Delivery received!";
        }
        throw new CustomerNotFoundException("Customer not found!");
    }
}
