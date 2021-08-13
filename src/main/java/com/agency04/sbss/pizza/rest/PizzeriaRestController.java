package com.agency04.sbss.pizza.rest;

import com.agency04.sbss.pizza.model.PizzeriaDetails;
import com.agency04.sbss.pizza.service.PizzaDeliveryService;
import com.agency04.sbss.pizza.service.PizzeriaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class PizzeriaRestController {

    private PizzeriaService pizzeriaService;
    //dependency
    public PizzeriaRestController(PizzaDeliveryService pizzaDeliveryService) {
        this.pizzeriaService = pizzaDeliveryService.getPizzeriaService();
    }


    @GetMapping("/pizzeria")
    @ResponseBody
    public String sayPizzeriaDetails(){
        PizzeriaDetails pizzeriaDetails = new PizzeriaDetails();
        //set the name, address collected from PizzaDeliveryService
        pizzeriaDetails.setName(pizzeriaService.getName());
        pizzeriaDetails.setAddress(pizzeriaService.getAddress());
        return "Pizzeria making the order:  "+pizzeriaDetails.getName() +
                ", at the address: " + pizzeriaDetails.getAddress();
    }


    @GetMapping("/pizzeria/menu")
    @ResponseBody
    public String printMenu(){
        return "Pizzas: "+ pizzeriaService.getPizzaType() + " and sizes: " + pizzeriaService.getSize();
    }

}
