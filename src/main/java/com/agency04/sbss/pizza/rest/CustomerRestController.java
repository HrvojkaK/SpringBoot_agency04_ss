package com.agency04.sbss.pizza.rest;

import com.agency04.sbss.pizza.exception.CustomerNotFoundException;
import com.agency04.sbss.pizza.model.Customer;
import com.agency04.sbss.pizza.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/customer")
public class CustomerRestController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/{id}")
    @ResponseBody
    public Customer findById(@PathVariable int id) {
        Customer customer = customerService.findById(id);
        return customer;
    }

    @GetMapping("/list")
    public List<Customer> findAll()
    {
        return customerService.findAll();
    }

    @PostMapping("")
    @ResponseBody
    public String addTheCustomer(@RequestBody Customer customer) {
        customerService.save(customer);
        return "Account created";
    }

    @PutMapping("")
    @ResponseBody
    public String updateTheCustomer(@RequestBody Customer customer){
        Customer tempCustomer = customerService.findById(customer.getId());
        if(tempCustomer == null) {
            throw new CustomerNotFoundException("No such id");
        }
        customerService.save(customer);
        return "Updated";
    }

    @DeleteMapping("/{id}")
    @ResponseBody
    public String deleteTheCustomer(@PathVariable int id){
        customerService.deleteById(id);
        return "Deleted";
    }

}
