/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mateo
 */
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class Warehouse {

    private Map<String, Integer> productsPrice;
    private Map<String, Integer> productsStock;

    public Warehouse() {
        this.productsPrice = new HashMap<>();
        this.productsStock = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        productsPrice.put(product, price);
        productsStock.put(product, stock);
    }

    public int price(String product) {
        if (productsPrice.containsKey(product)) {
            return this.productsPrice.get(product);
        }
        return -99;
    }

    public int stock(String product) {
        if (productsStock.containsKey(product)) {
            return this.productsStock.get(product);
        }
        return 0;
    }

    public boolean take(String product) {
        if (productsStock.containsKey(product)) {
            int stock = productsStock.get(product);
            if (stock - 1 >= 0) {
                stock--;
                productsStock.put(product, stock);
                return true;
            }
        }
        return false;
    }
    
    public Set<String> products() {
        return productsStock.keySet();
    } 
}
