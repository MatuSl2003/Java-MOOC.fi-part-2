/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mateo
 */
public class Student extends Person {

    private int studyCredits = 0;

    public Student(String name, String address) {
        super(name, address);
    }

    public int credits() {
        return studyCredits;
    }

    public void study() {
        studyCredits++;
    }
    
    @Override
    public String toString() {
        return getName() + 
        "\n" + "  " + getAddress() + 
        "\n  " + "Study credits " + credits(); 
    }

}
