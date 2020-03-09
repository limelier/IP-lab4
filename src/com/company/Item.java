package com.company;

public class Item {

    public Integer qty;

    public Integer price;

    public String name;

    public Item(Integer qty, Integer price, String name) {
        this.qty = qty;
        this.price = price;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Item{" +
                "qty=" + qty +
                ", price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}