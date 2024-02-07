/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mateo
 */
public class ProductWarehouseWithHistory extends ProductWarehouse {

    private ChangeHistory history;

    public ProductWarehouseWithHistory(String name, double capacity, double initialBalance) {
        super(name, capacity);
        this.history = new ChangeHistory();
        addToWarehouse(initialBalance);
    }

    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        this.history.add(super.getBalance());
    }

    public double takeFromWarehouse(double amount) {
        double amountRemoved = super.takeFromWarehouse(amount);
        this.history.add(super.getBalance());
        return amountRemoved;
    }

    public void printAnalysis() {
        System.out.println("Product: " + super.getName()
                + "\n" + "History: " + this.history.toString()
                + "\n" + "Largest amount of product: " + this.history.maxValue()
                + "\n" + "Smallest amount of product: " + this.history.minValue()
                + "\n" + "Average: " + this.history.average());
    }

    public String history() {
        return history.toString();
    }

}
