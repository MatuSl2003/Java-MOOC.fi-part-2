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

public class Hideout<T> {

    private ArrayList<T> list;

    public Hideout() {
        this.list = new ArrayList<>();
    }

    public void putIntoHideout(T toHide) {
        this.list.clear();
        this.list.add(toHide);
    }

    public T takeFromHideout() {
        if (this.list.isEmpty()) {
            return null;
        }
        T objectToRemove = this.list.get(0);
        this.list.remove(this.list.get(0));
        return objectToRemove;
    }

    public boolean isInHideout() {
        if (this.list.isEmpty()) {
            return false;
        }
        return true;
    }

}
