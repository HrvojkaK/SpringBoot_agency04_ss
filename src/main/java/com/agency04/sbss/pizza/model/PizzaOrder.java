package com.agency04.sbss.pizza.model;

import javax.persistence.*;


@Entity
public class PizzaOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private int quantity;

    @ManyToOne
    @JoinColumn(name="pizza_id", referencedColumnName = "id")
    private Pizza pizza;

    @Enumerated(EnumType.STRING)
    @Column(name= "pizza_size")
    private Size size;

    public PizzaOrder() {}

    public PizzaOrder(int quantity, Pizza pizza, Size size, Delivery delivery) {
        this.quantity = quantity;
        this.pizza = pizza;
        this.size = size;


    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public Pizza getPizza() { return pizza; }
    public void setPizza(Pizza pizza) { this.pizza = pizza; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public Size getPizzaSize() { return size; }
    public void setSize(Size size) { this.size = size; }

}
