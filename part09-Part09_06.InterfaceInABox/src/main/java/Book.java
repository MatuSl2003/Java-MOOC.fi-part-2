/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mateo
 */
public class Book implements Packable {
    
    private String name;
    private String author;
    private double weight;

    public Book(String author, String name, double weight) {
        this.name = name;
        this.author = author;
        this.weight = weight;
    }
    
    public double weight() {
        return this.weight;
    }
    
    @Override
    public String toString() {
        return this.author + ": " + this.name;
    }
           
            
}
