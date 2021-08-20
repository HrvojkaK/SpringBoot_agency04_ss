package com.agency04.sbss.pizza.service;

import com.agency04.sbss.pizza.exception.CustomerNotFoundException;
import com.agency04.sbss.pizza.form.DeliveryOrderForm;
import com.agency04.sbss.pizza.model.Customer;
import com.agency04.sbss.pizza.model.Delivery;
import com.agency04.sbss.pizza.model.PizzaOrder;
import com.agency04.sbss.pizza.model.Size;
import com.agency04.sbss.pizza.repository.CustomerRepository;
import com.agency04.sbss.pizza.repository.DeliveryRepository;
import com.agency04.sbss.pizza.repository.PizzaOrderRepository;
import com.agency04.sbss.pizza.repository.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class DeliveryService {
    @Autowired
    private CustomerService customerService;

    @Autowired
    private PizzeriaService pizzeriaService;

    @Autowired
    private DeliveryRepository deliveryRepository;


    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private PizzaOrderRepository pizzaOrderRepository;
    @Autowired
    private PizzaRepository pizzaRepository;

    private List<PizzaOrder> pizzaOrders = new ArrayList<>();


    public List<Delivery> get(){
        return deliveryRepository.findAll();
    }

    public String makeOrder(DeliveryOrderForm deliveryOrderForm) {
        PizzaOrder pizzaOrder = new PizzaOrder();
        pizzaOrder.setPizza(pizzaRepository.getByName(deliveryOrderForm.getPizza()));
        pizzaOrder.setQuantity(deliveryOrderForm.getQuantity());
        pizzaOrder.setSize(Size.MEDIUM);
        pizzaOrderRepository.save(pizzaOrder);
        this.pizzaOrders.add(pizzaOrder);

        Customer customer = customerRepository.getById(deliveryOrderForm.getCustomer().getId());
        if (customer!=null) {
            deliveryOrderForm.setCustomer(customer);
            deliveryRepository.save(new Delivery(pizzaOrders,customer));
            return "Delivery received!";
        }
        throw new CustomerNotFoundException("Customer not found!");
    }
}
