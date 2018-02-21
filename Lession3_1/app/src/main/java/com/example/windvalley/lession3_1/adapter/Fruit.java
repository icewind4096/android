package com.example.windvalley.lession3_1.adapter;

/**
 * Created by windvalley on 2018/2/15.
 */

public class Fruit {
    private String name;
    private int imageId;
    private double price;

    public Fruit(String AName, int imageId, double price){
        this.name = AName;
        this.price = price;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
