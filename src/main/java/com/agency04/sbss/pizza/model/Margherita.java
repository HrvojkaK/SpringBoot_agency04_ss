package com.agency04.sbss.pizza.model;
import java.util.*;

public class Margherita implements Pizza {
    private final String name = "Margherita";
    private final List<String> ingredients = Arrays.asList("Tomato sauce", "Mozzarella", "Oregano");

    @Override
    public String getName(){
        return name;
    }

    @Override
    public List<String> getIngredients(){
        return ingredients;
    }
}
