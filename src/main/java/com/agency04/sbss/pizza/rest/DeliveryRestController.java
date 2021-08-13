package com.agency04.sbss.pizza.rest;

import com.agency04.sbss.pizza.form.DeliveryOrderForm;
import com.agency04.sbss.pizza.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/delivery")
public class DeliveryRestController {

    @Autowired
    private OrderService orderService;


    @PostMapping("/order")
    @ResponseBody
    public String addTheDeliveryOrderForm(@RequestBody DeliveryOrderForm deliveryOrderForm){
        String message = orderService.addDeliveryOrderForm(deliveryOrderForm);
        return message;
    }

    @GetMapping("/list")
    public List<DeliveryOrderForm> getAllDeliveryOrderForms(){
        return orderService.getAllDeliveryOrderForms();
    }
}
