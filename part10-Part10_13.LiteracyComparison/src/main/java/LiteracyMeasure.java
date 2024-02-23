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

public class LiteracyMeasure implements Comparable<LiteracyMeasure> {

    private String country;
    private int year;
    private String gender;
    private double literacyPercent;

    public LiteracyMeasure(String country, int year, String gender, double literacyPercent) {
        this.country = country;
        this.year = year;
        this.gender = gender;
        this.literacyPercent = literacyPercent;
    }
    
    @Override
    public String toString() {
        return this.country + " (" + this.year + "), " + this.gender + ", " + this.literacyPercent;
    }
    
    @Override
    public int compareTo(LiteracyMeasure measure) {
        if(this.literacyPercent < measure.literacyPercent) {
            return -1;
        } else if(this.literacyPercent == measure.literacyPercent) {
            return 0;
        } else {
            return 1;
        }
    }
    
    //Niger (2015), female, 11.01572
}
