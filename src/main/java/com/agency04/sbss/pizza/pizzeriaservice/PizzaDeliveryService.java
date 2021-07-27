package com.agency04.sbss.pizza.pizzeriaservice;
import com.agency04.sbss.pizza.pizzamodels.*;


public class PizzaDeliveryService {

    //define a private field for the dependancy
    private PizzeriaService pizzeriaService;

    //define a constructor for dependency injection:
    public PizzaDeliveryService(PizzeriaService pservice){
        this.pizzeriaService = pservice;
    }


    public String orderPizza(Pizza p){
        String orderDescription = "You'll get " + p.getIngredients()
                + " on your pizza base.";
        return orderDescription;
    }
}
