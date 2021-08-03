package com.agency04.sbss.pizza;
import com.agency04.sbss.pizza.pizzamodels.*;
import com.agency04.sbss.pizza.pizzeriaservice.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@SpringBootApplication
public class PizzaApp {

    public static void main(String[] args) {

        SpringApplication.run(PizzaApp.class, args);

        //read the spring config class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PizzaConfig.class);

        //retrieve bean from spring container
        PizzaDeliveryService delivery = context.getBean("delivery", PizzaDeliveryService.class);

        //call methods on the bean
        Pizza pizzaMargherita = new Margherita();
        System.out.println(delivery.orderPizza(pizzaMargherita));

        //close the context
        context.close();

    }

}
