package com.merlin.hazi2;

public class WishItem
{
    private String name;
    private int price;
    public int savedmoney;

    public WishItem(String name, int price, int savedmoney) {
        this.name = name;
        this.price = price;
        this.savedmoney = savedmoney;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public void setPrice(int price) 
    {
        this.price = price;
    }

    public void setSavedmoney(int savedmoney) 
    {
        this.savedmoney = savedmoney;
    }
    
    
}
