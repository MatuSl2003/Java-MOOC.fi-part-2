/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mateo
 */
public class Teacher extends Person {
    
    private int salary = 0;
    
    public Teacher(String name, String address, int salary) {
        super(name, address);
        this.salary = salary;
    }
    
    @Override
    public String toString() {
        return getName() + 
        "\n  " + getAddress() + 
        "\n  salary " + salary + " euro/month";
    }
}
