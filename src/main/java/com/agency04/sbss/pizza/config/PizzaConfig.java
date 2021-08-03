package com.agency04.sbss.pizza.config;
import com.agency04.sbss.pizza.pizzeriaservice.FirstPizzeria;
import com.agency04.sbss.pizza.pizzeriaservice.PizzeriaService;
import com.agency04.sbss.pizza.pizzeriaservice.SecondPizzeria;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.agency04.sbss.pizza.pizzeriaservice")
@PropertySource("classpath:application.properties")
public class PizzaConfig {

    @Bean("due")
    @Primary
    public PizzeriaService due(){
        SecondPizzeria pizzeriaDue = new SecondPizzeria();
        return pizzeriaDue;
    }
}
