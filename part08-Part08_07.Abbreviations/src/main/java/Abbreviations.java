/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mateo
 */
import java.util.HashMap;

public class Abbreviations {

    private HashMap<String, String> abbrevs;

    public Abbreviations() {
        this.abbrevs = new HashMap();
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        this.abbrevs.put(abbreviation, explanation);
    }

    public boolean hasAbbreviation(String abbreviation) {
        if (this.abbrevs.containsKey(abbreviation)) {
            return true;
        }
        return false;
    }

    public String findExplanationFor(String abbreviation) {
        if (!(this.abbrevs.containsKey(abbreviation))) {
            return null;
        }
        return this.abbrevs.get(abbreviation);

    }

}
