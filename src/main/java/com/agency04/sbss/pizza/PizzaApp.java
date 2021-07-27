package com.agency04.sbss.pizza;
import com.agency04.sbss.pizza.pizzamodels.*;
import com.agency04.sbss.pizza.pizzeriaservice.*;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PizzaApp {

    public static void main(String[] args) {
        // testing this and that
        //Pizza p = new FruttiDiMare();
        //System.out.println(p.getIngredients());

        //PizzeriaService ps = new FirstPizzeria();
        //System.out.println(ps.makePizza(p));

        //PizzeriaService psDue = new SecondPizzeria();
        //System.out.println(ps.makePizza(p));


        //load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");

        //retrieve bean from spring container
        PizzaDeliveryService deliveryUno = context.getBean("deliveryUno", PizzaDeliveryService.class);
        PizzaDeliveryService deliveryDue = context.getBean("deliveryDue", PizzaDeliveryService.class);

        //call method on the bean
        Pizza pizza = new Margherita();
        System.out.println(deliveryUno.orderPizza(pizza));
        Pizza p2 = new FruttiDiMare();
        System.out.println(deliveryDue.orderPizza(p2));

        //close the context
        context.close();



    }

}
