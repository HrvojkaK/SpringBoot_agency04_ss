package com.agency04.sbss.pizza.model.pizzas;
import com.agency04.sbss.pizza.model.Pizza;

import javax.persistence.Entity;
import java.util.*;

@Entity
public class FruttiDiMare extends Pizza {
    private String name = "Frutti di mare";
    private List<String> ingredients = Arrays.asList("Tomato sauce", "Seafood");

    @Override
    public String getName(){
        return name;
    }

    @Override
    public List<String> getIngredients(){
        return ingredients;
    }

}