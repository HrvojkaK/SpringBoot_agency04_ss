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
        SecondPizzeria pizzeriaDue = context.getBean("due", SecondPizzeria.class);

        //call method on the bean
        Pizza pizzaMargherita = new Margherita();
        System.out.println(pizzeriaDue.getName() + " is preparing your order. "
                +  deliveryUno.orderPizza(pizzaMargherita));
        System.out.println(pizzeriaDue.getCoupon());

        //close the context
        context.close();

    }

}
