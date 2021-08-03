package com.agency04.sbss.pizza;
import com.agency04.sbss.pizza.pizzamodels.*;
import com.agency04.sbss.pizza.pizzeriaservice.*;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PizzaApp {

    public static void main(String[] args) {

        //load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");

        //retrieve bean from spring container
        PizzaDeliveryService deliveryUno = context.getBean("delivery", PizzaDeliveryService.class);
        PizzaDeliveryService deliveryUno2 = context.getBean("delivery", PizzaDeliveryService.class);

        //call methods on the bean
        System.out.println("memory location of 1st instance of PizzaDeliveyService: " +deliveryUno);
        System.out.println("memory location of 2nd instance of PizzaDeliveyService: " +deliveryUno2 +"\n");

        Pizza pizzaMargherita = new Margherita();
        System.out.println(deliveryUno.orderPizza(pizzaMargherita));

        //close the context
        context.close();

    }

}
