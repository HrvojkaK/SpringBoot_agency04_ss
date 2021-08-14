package com.agency04.sbss.pizza.model;
import java.util.*;

public class FruttiDiMare implements Pizza {
    private final String name = "Frutti di mare";
    private final List<String> ingredients = Arrays.asList("Tomato sauce", "Seafood");

    @Override
    public String getName(){
        return name;
    }

    @Override
    public List<String> getIngredients(){
        return ingredients;
    }
}
