package com.agency04.sbss.pizza.model;
import javax.persistence.Entity;
import java.util.*;

//public class FruttiDiMare implements Pizza {
//    private final String name = "Frutti di mare";
//    private final List<String> ingredients = Arrays.asList("Tomato sauce", "Seafood");
//
//    @Override
//    public String getName(){
//        return name;
//    }
//
//    @Override
//    public List<String> getIngredients(){
//        return ingredients;
//    }
//}

//import javax.persistence.Entity;
//import java.util.List;

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