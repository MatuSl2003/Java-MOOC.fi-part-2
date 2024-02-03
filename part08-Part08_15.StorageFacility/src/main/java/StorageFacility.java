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
import java.util.ArrayList;

public class StorageFacility {

    private HashMap<String, ArrayList<String>> facility;

    public StorageFacility() {
        this.facility = new HashMap<>();
    }

    public void add(String unit, String item) {
        this.facility.putIfAbsent(unit, new ArrayList<>());
        this.facility.get(unit).add(item);
    }

    public ArrayList<String> contents(String unit) {
        if (!this.facility.keySet().contains(unit)) {
            return new ArrayList();
        }
        return this.facility.get(unit);
    }

    public void remove(String unit, String item) {
        this.facility.get(unit).remove(item);
        if (this.facility.get(unit).isEmpty()) {
            this.facility.remove(unit);
        }
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> units = new ArrayList<>();
        for (String key : facility.keySet()) {
            if (!facility.get(key).isEmpty()) {
                units.add(key);
            }
        }
        return units;
    }
}
