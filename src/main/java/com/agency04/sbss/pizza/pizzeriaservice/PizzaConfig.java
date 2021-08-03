package com.agency04.sbss.pizza.pizzeriaservice;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.agency04.sbss.pizza.pizzeriaservice")
@PropertySource("classpath:application.properties")
public class PizzaConfig {
    @Bean
    public PizzeriaService uno(){
        FirstPizzeria pizzeriaUno = new FirstPizzeria();
        return pizzeriaUno;
    }

    @Bean
    @Primary
    public PizzeriaService due(){
        SecondPizzeria pizzeriaDue = new SecondPizzeria();
        return pizzeriaDue;
    }
}
