package com.agency04.sbss.pizza.rest;

import com.agency04.sbss.pizza.pizzeria.Customer;
import com.agency04.sbss.pizza.pizzeria.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
public class CustomerRestController {
    //inject dependency for CusttomerServise
    @Autowired
    private CustomerService customerService;

    @GetMapping("/customer/{username}")
    @ResponseBody
    public Customer getTheSingleCustomer(@PathVariable String username) {
        Customer customer = customerService.getSingleCustomer(username);
         return customer;
    }

    @PostMapping("/customer")
    @ResponseBody
    public String addTheCustomer(@RequestBody Customer customer) {
        String message = customerService.addCustomer(customer);
        return message;
    }

    @PutMapping("/customer")
    @ResponseBody
    public String updateTheCustomer(@RequestBody Customer customer){
        String message = customerService.updateCustomer(customer);
        return message;
    }

    @DeleteMapping("/customer/{username}")
    @ResponseBody
    public String deleteTheCustomer(@PathVariable String username){
        String message = customerService.deleteCustomer(username);
        return message;
    }



}
