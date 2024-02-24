/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mateo
 */
public class Person {

    private String name;
    private Education educationLevel;

    public Person(String name, Education educationLevel) {
        this.name = name;
        this.educationLevel = educationLevel;
    }

    public Education getEducation() {
        return educationLevel;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.educationLevel;
    }
}
