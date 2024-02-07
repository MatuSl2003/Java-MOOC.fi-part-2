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

public class OneItemBox extends Box {

    private ArrayList<Item> box;

    public OneItemBox() {
        this.box = new ArrayList<Item>();
    }

    @Override
    public void add(Item item) {
        if (box.isEmpty()) {
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
