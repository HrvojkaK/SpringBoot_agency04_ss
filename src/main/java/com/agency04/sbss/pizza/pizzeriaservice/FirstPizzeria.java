package com.agency04.sbss.pizza.pizzeriaservice;
import com.agency04.sbss.pizza.pizzamodels.Pizza;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


@Service("uno") //creates bean with id: uno
public class FirstPizzeria implements PizzeriaService {

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
    public String makePizza(Pizza p){
        return "I'm making a " + p.getName() + " for you.";
    }
}
