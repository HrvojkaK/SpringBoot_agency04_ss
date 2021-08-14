package com.agency04.sbss.pizza.model;

import java.util.List;

public class Menu {
    private List<String> pizzaType;
    private List<String> size;

    public Menu() {}

    public List<String> getPizzaType() { return pizzaType; }
    public List<String> getSize() { return size; }
    public void setPizzaType(List<String> pizzaType) { this.pizzaType = pizzaType; }
    public void setSize(List<String> size) { this.size = size; }

}
