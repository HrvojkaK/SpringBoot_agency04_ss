package com.agency04.sbss.pizza.pizzeriaservice;
import com.agency04.sbss.pizza.pizzamodels.*;


public class PizzaDeliveryService {

    ////public String getName(){}
    //// ...getAddress
    ////...makePizza

    ////@Override
    ////public String getName(){
    ////    return "Trattoria 1";
    ////}

    //@Override
    public String orderPizza(Pizza p){
        String orderDescription = "You'll get " + p.getIngredients()
                + " on your pizza base.";
        return orderDescription;
    }
}
