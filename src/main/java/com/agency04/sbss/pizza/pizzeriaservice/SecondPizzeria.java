package com.agency04.sbss.pizza.pizzeriaservice;
import com.agency04.sbss.pizza.pizzamodels.Pizza;

public class SecondPizzeria implements PizzeriaService {

    private String name;
    private String address;
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
