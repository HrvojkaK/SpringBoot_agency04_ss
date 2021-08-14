package com.agency04.sbss.pizza.service;
import com.agency04.sbss.pizza.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service("delivery")
public class PizzaDeliveryService {

    //define a private field for the dependency
    private PizzeriaService pizzeriaService;

    //no arg constructor
    public PizzaDeliveryService(){}

    //define a constructor for dependency injection: (uno / due)
    @Autowired
    public PizzaDeliveryService(PizzeriaService pservice){
        this.pizzeriaService = pservice;
        System.out.println("inside of arg constructor; using "
                +pservice.getName() + ", with address " + pservice.getAddress() +", as @Primary bean");
    }

    //define an init method (to be executed after constructor&injection of dependencies)
    @PostConstruct
    public void doStartupStuff(){
        System.out.println("(inside of doStartupStuff init method)");
    }

    //define a destroy method
    @PreDestroy
    public void doCleanupStuff(){
        System.out.println("(inside of doCleanupStuff destroy method)");
    }

    //need it for PizzeriaDetails
    public PizzeriaService getPizzeriaService() {
        return pizzeriaService;
    }

    public String orderPizza(Pizza p){
        String orderDescription = "You'll get " + p.getIngredients()
                + " on your pizza base.";
        return orderDescription;
    }

}
