package com.company;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    public List<Item> contents;

    public Integer total() {
        int sum = 0;
        for (Item item : contents) {
            sum += item.qty * item.price;
        }
        return sum;
    }

    public void checkout() {
        System.out.println("The total is " + total());
        contents = null;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "contents=" + contents +
                '}';
    }

    public Cart() {
        this.contents = new ArrayList<>();
    }
}