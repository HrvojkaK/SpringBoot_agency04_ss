package com.agency04.sbss.pizza.pizzeriaservice;
import com.agency04.sbss.pizza.pizzamodels.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("delivery")
public class PizzaDeliveryService {

    //define a private field for the dependancy
    private PizzeriaService pizzeriaService;

    //define a constructor for dependency injection:
    @Autowired

    public PizzaDeliveryService(@Qualifier("uno") PizzeriaService pservice){
        this.pizzeriaService = pservice;
    }


    public String orderPizza(Pizza p){
        String orderDescription = "You'll get " + p.getIngredients()
                + " on your pizza base.";
        return orderDescription;
    }
}
