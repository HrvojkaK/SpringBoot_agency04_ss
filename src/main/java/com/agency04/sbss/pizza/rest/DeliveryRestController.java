
//w3 upgradede to w4M

package com.agency04.sbss.pizza.rest;

import com.agency04.sbss.pizza.form.DeliveryOrderForm;
import com.agency04.sbss.pizza.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/delivery")
public class MyDeliveryRestController {

    //@Autowired nop.old, from w3.
    //private OrderService orderService;

    @Autowired
    private MyDeliveryService deliveryService;


    @PostMapping("/order")
    @ResponseBody
    public String createOrder(@RequestBody MyDelivery delivery){
        deliveryService.create(delivery);
        return "Order created";
    }

  //M:
 //   @GetMapping("/list")
 //   public ResponseEntity<List<MyDelivery>> getOrders(){
 //       return new ResponseEntity<List<Delivery>>(deliveryService.get(), HttpStatus.OK);
 //   }

    @GetMapping("/list")
    public List<MyDelivery> getOrders(){
        return deliveryService.get();
    }

 //w3:
//    @GetMapping("/list")
//    public List<DeliveryOrderForm> getAllDeliveryOrderForms(){
//        return orderService.getAllDeliveryOrderForms();
//    }
}



// old w3:

///    CustomerService customerService;
///    DeliveryService deliveryService;
///    @Autowired
///    PizzeriaService pizzeriaService;
///    private List<Pizza> thePizza;
///    @PostMapping("/delivery/order")
///    public String deliverOrder()
///    {
///        return customerService.findAll()+ ", Your order is"+ thePizza;
///    }
///    @GetMapping("/delivery/list")
///    public List<Delivery> getAllD()
///    {
///        return deliveryService.findAll();
///    }
///
///}
