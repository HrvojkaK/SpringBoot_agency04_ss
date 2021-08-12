package com.agency04.sbss.pizza.rest;

import com.agency04.sbss.pizza.pizzeria.Menu;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api")
public class MenuRestController {

    //make endpoint for menu: /pizzeria/menu
    //@GetMapping("/pizzeria/menu")
    //@ResponseBody
    //public String sayPizzasSizes(){
    //   Menu myMenu = new Menu();
    //   return "Pizzas:  "+ myMenu.getPizzaType() + " and sizes: " + myMenu.getSize();
    //}

    // this for jackson & json response
    @GetMapping("/pizzeria/menu")
    @ResponseBody
    public Menu getMenu() {
        Menu myMenu = new Menu();
        return myMenu;
    }

}
