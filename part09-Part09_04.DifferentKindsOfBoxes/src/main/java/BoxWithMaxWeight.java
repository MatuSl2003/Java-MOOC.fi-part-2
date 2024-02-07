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

public class BoxWithMaxWeight extends Box {

    private int capacity;
    private ArrayList<Item> box;

    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.box = new ArrayList<Item>();
    }

    @Override
    public void add(Item item) {
        int totalWeight = 0;
        for (Item itemo : box) {
            totalWeight += itemo.getWeight();
        }
        if (item.getWeight() + totalWeight <= capacity) {
            box.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        if (box.contains(item)) {
            return true;
        }
        return false;
    }

}
