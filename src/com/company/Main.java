package com.company;

public class Main {

    public static void main(String[] args) {
        Item item1 = new Item(5, 2, "Carrot");
        Item item2 = new Item(2, 3, "Gold Ingot");
        Item item3 = new Item(1, 5, "Diamond");

        Cart cart = new Cart();
        Stock stock = new Stock(item1, item2, item3);

        stock.addToCart("Diamond", 1, cart);
        System.out.println(cart);
    }
}
