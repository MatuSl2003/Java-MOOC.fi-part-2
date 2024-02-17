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

public class Herd implements Movable {

    private List<Movable> herd;

    public Herd() {
        this.herd = new ArrayList<>();
    }

    public void addToHerd(Movable movable) {
        herd.add(movable);
    }

    public void move(int dx, int dy) {
        for (Movable thingThatMoves : herd) {
            thingThatMoves.move(dx, dy);
        }
    }

    @Override
    public String toString() {
        String allHerd = "";
        for (Movable thingThatMoves : herd) {
            allHerd += thingThatMoves.toString() + "\n";
        }
        return allHerd;
    }
}
