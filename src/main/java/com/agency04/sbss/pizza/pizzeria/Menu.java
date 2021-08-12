package com.agency04.sbss.pizza.pizzeria;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class Menu {
    List<String> pizzaType = Arrays.asList("Margherita", "Marinara", "Frutti di Mare");
    List<String> size = Arrays.asList("small", "regular", "jumbo");

    // default no arg constructor
    public Menu(){}


    //getters and setters:
    public List<String> getPizzaType(){ return pizzaType; }
    public List<String> getSize(){ return size; }

    public void setPizzaType(List<String> pizzaType){ this.pizzaType = pizzaType; }
    public void setSize(List<String> size){ this.size = size; }

}
