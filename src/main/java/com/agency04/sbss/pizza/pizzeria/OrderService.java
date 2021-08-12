package com.agency04.sbss.pizza.pizzeria;

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
    public List<DeliveryOrderForm> deliveryOrderForms = new ArrayList<>();

    public String addDeliveryOrderForm(DeliveryOrderForm deliveryOrderForm) {
        this.deliveryOrderForms.add(deliveryOrderForm);
        return "Order received."; //or? exc.
    }

    public List<DeliveryOrderForm> getAllDeliveryOrderForms() {
        return deliveryOrderForms;
    }
}
