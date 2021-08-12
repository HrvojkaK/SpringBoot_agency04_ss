package com.agency04.sbss.pizza.rest;

import com.agency04.sbss.pizza.pizzeria.PizzeriaDetails;
import com.agency04.sbss.pizza.pizzeriaservice.PizzaDeliveryService;
import com.agency04.sbss.pizza.pizzeriaservice.PizzeriaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api")
public class PizzeriaDetailsRestController {

    private PizzeriaService pizzeriaService;
    //dependency
    public PizzeriaDetailsRestController(PizzaDeliveryService pizzaDeliveryService) {
        this.pizzeriaService = pizzaDeliveryService.getPizzeriaService();
    }

    //make endpoint for pizzeria details: /pizzeria
    //@GetMapping("/pizzeria")
    //@ResponseBody
    //public String sayPizzeriaDetails(){
    //    PizzeriaDetails pizzeriaDetails = new PizzeriaDetails();
    //    //set the name, address collected from PizzaDeliveryService
    //    pizzeriaDetails.setName(pizzeriaService.getName());
    //    pizzeriaDetails.setAddress(pizzeriaService.getAddress());
    //    return "Pizzeria making the order:  "+pizzeriaDetails.getName() + ", at the address: " + pizzeriaDetails.getAddress();
    //}

    // this for jackson & json response
    @GetMapping("/pizzeria")
    @ResponseBody
    public PizzeriaDetails getPizzeriaDetails() {
        PizzeriaDetails pizzeriaDetails = new PizzeriaDetails();
        pizzeriaDetails.setName(pizzeriaService.getName());
        pizzeriaDetails.setAddress(pizzeriaService.getAddress());
        return pizzeriaDetails;
    }

}

