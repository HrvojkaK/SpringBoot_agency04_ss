package com.agency04.sbss.pizza.pizzeriaservice;
import com.agency04.sbss.pizza.pizzamodels.Pizza;

public interface PizzeriaService {
    public String getName();
    public String getAddress();
    public String makePizza(Pizza p);
}
