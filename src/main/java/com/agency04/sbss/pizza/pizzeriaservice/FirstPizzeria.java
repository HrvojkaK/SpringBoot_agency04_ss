package com.agency04.sbss.pizza.pizzeriaservice;
import com.agency04.sbss.pizza.pizzamodels.Pizza;

public class FirstPizzeria implements PizzeriaService {

    private String name;
    private String address;

    public void setName(String name){
        this.name = name;
    }

    public void setAddress(String address){
        this.address = address;
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public String getAddress(){
        return address;
    }

    @Override
    public String makePizza(Pizza p){
        return "I'm making a " + p.getName() + " for you.";
    }
}
