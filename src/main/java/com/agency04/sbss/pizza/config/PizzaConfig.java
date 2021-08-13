package com.agency04.sbss.pizza.config;
import com.agency04.sbss.pizza.service.PizzeriaService;
import com.agency04.sbss.pizza.service.SecondPizzeria;
import org.springframework.context.annotation.*;


@Configuration
@PropertySource("classpath:application.properties")
public class PizzaConfig {

    @Bean("due")
    @Primary
    public PizzeriaService due(){
        SecondPizzeria pizzeriaDue = new SecondPizzeria();
        return pizzeriaDue;
    }
}
