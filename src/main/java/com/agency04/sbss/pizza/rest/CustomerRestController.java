package com.agency04.sbss.pizza.rest;

import com.agency04.sbss.pizza.model.Customer;
import com.agency04.sbss.pizza.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/api/customer")
public class CustomerRestController {
    //inject dependency for CustomerService
    @Autowired
    private CustomerService customerService;


    @GetMapping("/{username}")
    @ResponseBody
    public Customer getTheSingleCustomer(@PathVariable String username) {
        Customer customer = customerService.getSingleCustomer(username);
         return customer;
    }

    @PostMapping("")
    @ResponseBody
    public String addTheCustomer(@RequestBody Customer customer) {
        String message = customerService.addCustomer(customer);
        return message;
    }

    @PutMapping("")
    @ResponseBody
    public String updateTheCustomer(@RequestBody Customer customer){
        String message = customerService.updateCustomer(customer);
        return message;
    }

    @DeleteMapping("/{username}")
    @ResponseBody
    public String deleteTheCustomer(@PathVariable String username){
        String message = customerService.deleteCustomer(username);
        return message;
    }

}
