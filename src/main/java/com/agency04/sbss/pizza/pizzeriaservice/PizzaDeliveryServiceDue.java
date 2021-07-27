package com.agency04.sbss.pizza.pizzeriaservice;
import com.agency04.sbss.pizza.pizzamodels.*;


public class PizzaDeliveryServiceDue {

    //define a private field for the dependency
    private PizzeriaService pizzeriaService;

    //setter injection
    public void setPizzaDeliveryServiceDue(PizzeriaService pservice){
        this.pizzeriaService = pservice;
    }


    public String orderPizza(Pizza p){
        String orderDescription = "You'll get " + p.getIngredients()
                + " on your pizza base.";
        return orderDescription;
    }
}

