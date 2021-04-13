package com.example.reclyclerviewapp;

public class Product {
    String name;
    float price;
    Boolean needToBuy;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Boolean getNeedToBuy() {
        return needToBuy;
    }

    public void setNeedToBuy(Boolean needToBuy) {
        this.needToBuy = needToBuy;
    }

    public Product(String name, float price, Boolean needToBuy) {
        this.name = name;
        this.price = price;
        this.needToBuy=needToBuy;
    }
}
