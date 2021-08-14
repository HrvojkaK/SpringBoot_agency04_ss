package com.agency04.sbss.pizza.service;

import com.agency04.sbss.pizza.form.DeliveryOrderForm;
import com.agency04.sbss.pizza.exception.PizzaNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class OrderService {
    //hardcoded available pizzas
    private List<String> availablePizza = Arrays.asList("Margherita", "Marinara", "Frutti di Mare");
    private List<String> availableSize = Arrays.asList("small", "regular", "jumbo");
    //
    private List<DeliveryOrderForm> deliveryOrderForms = new ArrayList<>();

    public String addDeliveryOrderForm(DeliveryOrderForm deliveryOrderForm) {
        if(!availablePizza.contains(deliveryOrderForm.getPizza()) || !availableSize.contains(deliveryOrderForm.getSize())){
            throw new PizzaNotFoundException("Invalid order. Pizzas available: "
                    +availablePizza+ " in sizes: " + availableSize);
        }
        else {
            this.deliveryOrderForms.add(deliveryOrderForm);
        }
        return "Order received.";
    }

    public List<DeliveryOrderForm> getAllDeliveryOrderForms() { return deliveryOrderForms; }
}
