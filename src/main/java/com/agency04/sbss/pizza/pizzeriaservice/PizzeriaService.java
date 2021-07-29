package com.agency04.sbss.pizza.pizzeriaservice;
import com.agency04.sbss.pizza.pizzamodels.Pizza;

public interface PizzeriaService {
    String getName();
    String getAddress();
    String makePizza(Pizza p);
}
