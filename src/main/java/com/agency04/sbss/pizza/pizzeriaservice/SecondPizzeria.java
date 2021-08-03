package com.agency04.sbss.pizza.pizzeriaservice;
import com.agency04.sbss.pizza.pizzamodels.Pizza;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service //("due")
public class SecondPizzeria implements PizzeriaService {

    @Value("${dvar.name}")
    private String name;

    @Value("${dvar.address}")
    private String address;

    @Value("${dvar.coupon}")
    private String coupon;

    public void setName(String name){
        this.name = name;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void setCoupon(String coupon){
        this.coupon = coupon;
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public String getAddress(){
        return address;
    }

    public String getCoupon(){
        return "On your next purchase, you can use this discount code: " + coupon;
    }

    @Override
    public String makePizza(Pizza p){
        return "I'm making a " + p.getName() + " for you.";
    }
}
