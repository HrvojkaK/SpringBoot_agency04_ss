package com.agency04.sbss.pizza.model;
import javax.persistence.Entity;
import java.util.*;


@Entity
public class Margherita extends Pizza {
    private String name = "Margherita";
    private List<String> ingredients = Arrays.asList("Tomato sauce", "Mozzarella", "Oregano");

    @Override
    public String getName(){
        return name;
    }

    @Override
    public List<String> getIngredients(){
        return ingredients;
    }
}
