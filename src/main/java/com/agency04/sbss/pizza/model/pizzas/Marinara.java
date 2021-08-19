package com.agency04.sbss.pizza.model;
import javax.persistence.Entity;
import java.util.*;

@Entity
public class Marinara extends Pizza {
    private final String name = "Marinara";
    private final List<String> ingredients = Arrays.asList("Tomato sauce", "Garlic", "Basil");

    @Override
    public String getName(){
        return name;
    }

    @Override
    public List<String> getIngredients(){
        return ingredients;
    }
}
