package com.agency04.sbss.pizza;
import com.agency04.sbss.pizza.pizzamodels.*;
import com.agency04.sbss.pizza.pizzeriaservice.*;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PizzaApp {

    public static void main(String[] args) {

        //load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");

        //retrieve bean from spring container
        PizzaDeliveryService deliveryUno = context.getBean("deliveryUno", PizzaDeliveryService.class);
        PizzaDeliveryService deliveryDue = context.getBean("deliveryDue", PizzaDeliveryService.class);

        //call method on the bean
        Pizza pizzaMargherita = new Margherita();
        System.out.println(deliveryUno.orderPizza(pizzaMargherita));
        Pizza pizzaFruttiDiMare = new FruttiDiMare();
        System.out.println(deliveryDue.orderPizza(pizzaFruttiDiMare));

        //close the context
        context.close();

    }

}
