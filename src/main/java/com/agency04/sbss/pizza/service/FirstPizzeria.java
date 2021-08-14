package com.agency04.sbss.pizza.service;
import com.agency04.sbss.pizza.model.Pizza;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;


@Service("uno") //creates bean with id: uno
public class FirstPizzeria implements PizzeriaService {
    private List<String> pizzaType = Arrays.asList("Margherita", "Marinara");
    private List<String> size = Arrays.asList("small", "regular", "jumbo");

    @Value("Pizzeria Uno")
    private String name;

    @Value("Street A 1")
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
    public List<String> getPizzaType() { return pizzaType; }

    @Override
    public List<String> getSize() { return size; }

    @Override
    public String makePizza(Pizza pizza){
        return "I'm making a " + pizza.getName() + " for you.";
    }
}
