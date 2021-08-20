package com.agency04.sbss.pizza.rest;

import com.agency04.sbss.pizza.model.Menu;
import com.agency04.sbss.pizza.model.PizzeriaDetails;
import com.agency04.sbss.pizza.service.PizzeriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class PizzeriaRestController {

    @Autowired
    PizzeriaService pizzeriaService;

    @GetMapping("/pizzeria")
    @ResponseBody
    public PizzeriaDetails getPizzeriaDetails() {
        PizzeriaDetails pizzeriaDetails = new PizzeriaDetails();
        pizzeriaDetails.setName(pizzeriaService.getName());
        pizzeriaDetails.setAddress(pizzeriaService.getAddress());
        return pizzeriaDetails;
    }

    @GetMapping("/pizzeria/menu")
    @ResponseBody
    public Menu getMenu() {
        Menu menu = new Menu();
        menu.setPizzaType(pizzeriaService.getPizzaType());
        menu.setSize(pizzeriaService.getSize());
        return menu;
    }

}
