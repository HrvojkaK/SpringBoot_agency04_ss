package com.agency04.sbss.pizza.pizzeriaservice;
import com.agency04.sbss.pizza.pizzamodels.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("delivery")
@Scope("prototype") //default is singleton
public class PizzaDeliveryService {

    //define a private field for the dependency
    private PizzeriaService pizzeriaService;

    //define a constructor for dependency injection: (uno)
    @Autowired
    public PizzaDeliveryService(@Qualifier("uno") PizzeriaService pservice){
        this.pizzeriaService = pservice;
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

    public String orderPizza(Pizza p){
        String orderDescription = "You'll get " + p.getIngredients()
                + " on your pizza base.";
        return orderDescription;
    }
}
