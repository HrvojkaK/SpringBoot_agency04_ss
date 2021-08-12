package com.agency04.sbss.pizza.config;
import com.agency04.sbss.pizza.pizzeriaservice.FirstPizzeria;
import com.agency04.sbss.pizza.pizzeriaservice.PizzeriaService;
import com.agency04.sbss.pizza.pizzeriaservice.SecondPizzeria;
import org.springframework.context.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
//new 3
@EnableWebMvc
//w3: i dodam novi komponent scan package jer bum stavljala nove beanove u neki novi folder:
@ComponentScan("com.agency04.sbss.pizza.pizzeria")
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
