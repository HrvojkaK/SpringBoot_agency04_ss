package com.agency04.sbss.pizza.rest;


import com.agency04.sbss.pizza.model.Delivery;
import com.agency04.sbss.pizza.service.DeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/delivery")
public class DeliveryRestController {


    @Autowired
    private DeliveryService deliveryService;


    @PostMapping("/order")
    @ResponseBody
    public String makeOrder(@RequestBody Delivery delivery) {
        String message = deliveryService.makeOrder(delivery);
        return message;
    }


    @GetMapping("/list")
    public List<Delivery> getTheOrders() {
        return deliveryService.get();
    }

}

