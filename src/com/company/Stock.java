package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Stock {
    public List<Item> itemStock;

    public Stock(Item... items) {
        this.itemStock = Arrays.asList(items);
    }

    public void addToCart(String name, Integer qty, Cart cart) {
        Item item;
        Optional<Item> optional = itemStock.stream().filter(itm -> itm.name.equals(name)).findAny();
        if (optional.isEmpty()) {
            System.out.println("Cannot add to cart!");
            return;
        } else {
            item = optional.get();
        }

        if (qty > item.qty)
            System.out.println("The stock doesn't have enough items for your request.");
        else {
            Item cartItem = new Item(qty, item.price, item.name);
            item.qty -= qty;
            cart.contents.add(cartItem);
            System.out.println("The item " + item.name + " was added to the cart.");
        }
    }

}