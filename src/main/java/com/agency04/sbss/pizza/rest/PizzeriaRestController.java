package com.agency04.sbss.pizza.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDateTime;

@RestController
public class PizzeriaRestController {
    @Value("${dvar.name}")
    private String name;

    //expose "/" which returns Hello world
    @GetMapping("/")
    public String sayHello(){
        return " Hello world! "+name +" is online. Local time on server is " + LocalDateTime.now();
    }
}
