package com.merlin.hazi2;

import java.util.ArrayList;

class Item 
{
    private String name;
    private double price;
    private int sMoney;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
    
}
