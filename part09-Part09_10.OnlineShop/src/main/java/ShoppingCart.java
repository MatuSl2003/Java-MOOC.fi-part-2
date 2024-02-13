/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mateo
 */
import java.util.List;
import java.util.ArrayList;

public class ShoppingCart {

    private List<Item> cart;

    public ShoppingCart() {
        this.cart = new ArrayList<>();
    }

    public void add(String product, int price) {
        if (!cart.contains(new Item(product, 1, price))) {
            cart.add(new Item(product, 1, price));
        } else {
            for(Item item: cart) {
                if(item.equals(new Item(product, 1, price))) {
                    item.increaseQuantity();
                }
            }
        }
    }

    public int price() {
        int price = 0;
        for (Item item : cart) {
            price += item.price();
        }
        return price;
    }

    public void print() {
        for (Item item : cart) {
            System.out.println(item);
        }
    }

}
