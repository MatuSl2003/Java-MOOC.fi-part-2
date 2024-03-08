/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 *
 * @author mateo
 */
import java.util.ArrayList;

public class Pipe<T> {

    private ArrayList<T> list;

    public Pipe() {
        this.list = new ArrayList<>();
    }

    public void putIntoPipe(T toAdd) {
        this.list.add(toAdd);
    }

    public T takeFromPipe() {
        if(this.list.isEmpty()) {
            return null;
        }
        T obj = this.list.get(0);
        this.list.remove(obj);
        return obj;
    }

    public boolean isInPipe() {
        if (this.list.isEmpty()) {
            return false;
        }
        return true;
    }

}
