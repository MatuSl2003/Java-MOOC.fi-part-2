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
import java.util.List;
import java.util.Iterator;
import java.util.Collections;

public class Hand implements Comparable<Hand> {

    private List<Card> cards;

    public Hand() {
        this.cards = new ArrayList<>();
    }

    public void add(Card card) {
        this.cards.add(card);
    }

    public void print() {
        Iterator iterator = this.cards.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void sort() {
        Collections.sort(cards, (c1, c2) -> c1.compareTo(c2));

    }

    public int totalValue() {
        int value = this.cards.stream()
                .map(card -> card.getValue())
                .reduce(0, (previousSum, current) -> previousSum + current);
        return value;
    }

    public void sortBySuit() {
        Collections.sort(this.cards, (c1, c2) -> {
            if (c1.getSuit().ordinal() == c2.getSuit().ordinal()) {
                return c1.getValue() - c2.getValue();
            }
            return c1.getSuit().ordinal() - c2.getSuit().ordinal();
        });
    }

    @Override
    public int compareTo(Hand hand) {
        return this.totalValue() - hand.totalValue();
    }

}
