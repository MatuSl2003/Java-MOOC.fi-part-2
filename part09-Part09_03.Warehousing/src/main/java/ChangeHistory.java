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

public class ChangeHistory {

    private ArrayList<Double> history;

    public ChangeHistory() {
        this.history = new ArrayList<>();
    }

    public void add(double status) {
        this.history.add(status);
    }

    public void clear() {
        this.history.clear();
    }

    public double maxValue() {
        if (history.isEmpty()) {
            return 0.0;
        }
        double num = history.get(0);
        for (Double number : history) {
            if (number > num) {
                num = number;
            }
        }
        return num;
    }

    public double minValue() {
        if (history.isEmpty()) {
            return 0.0;
        }
        double num = history.get(0);
        for (Double number : history) {
            if (number < num) {
                num = number;
            }
        }
        return num;
    }

    public double average() {
        if (history.isEmpty()) {
            return 0.0;
        }
        // Calculate the sum of the numbers
        double sum = 0;
        for (double number : this.history) {
            sum += number;
        }
        // Calculate the average
        double average = (double) sum / history.size();
        return average;
    }

    @Override
    public String toString() {
        return this.history.toString();
    }

}
