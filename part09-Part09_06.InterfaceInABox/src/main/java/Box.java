/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mateo
 */
import java.util.ArrayList;

public class Box implements Packable {

    private ArrayList<Packable> items;
    private double capacity;

    public Box(double capacity) {
        this.items = new ArrayList<>();
        this.capacity = capacity;
    }

    public double weight() {
        double totalWeight = 0;
        for (Packable itemo : items) {
            totalWeight += itemo.weight();
        }
        return totalWeight;
    }

    public void add(Packable item) {
        if (item.weight() + this.weight() <= this.capacity) {
            items.add(item);
        }
    }

    @Override
    public String toString() {
        double totalWeight = 0;
        for (Packable itemo : items) {
            totalWeight += itemo.weight();
        }
        return "Box: " + this.items.size() + " items" + ", total weight " + totalWeight + " kg";
    }

}
