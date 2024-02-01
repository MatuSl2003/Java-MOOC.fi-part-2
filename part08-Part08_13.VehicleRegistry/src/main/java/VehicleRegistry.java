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

public class VehicleRegistry {

    private HashMap<LicensePlate, String> licensePlates;

    public VehicleRegistry() {
        this.licensePlates = new HashMap<>();
    }

    public boolean add(LicensePlate plate, String owner) {
        if (licensePlates.get(plate) == null) {
            licensePlates.put(plate, owner);
            return true;
        } else {
            return false;
        }

    }

    public String get(LicensePlate plate) {
        if (licensePlates.get(plate) == null) {
            return null;
        } else {
            return licensePlates.get(plate);
        }
    }

    public boolean remove(LicensePlate plate) {
        if (licensePlates.get(plate) == null) {
            return false;
        } else {
            licensePlates.remove(plate);
            return true;
        }
    }

    public void printLicensePlates() {
        for (LicensePlate plate : this.licensePlates.keySet()) {
            System.out.println(plate);
        }
    }

    public void printOwners() {
        ArrayList<String> owners = new ArrayList();
        for (String owner : this.licensePlates.values()) {
            if (!owners.contains(owner)) {
                owners.add(owner);
            }
        }
        for (String owner : owners) {
            System.out.println(owner);
        }
    }
}
