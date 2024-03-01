/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author mateo
 */
public class StandardSensor implements Sensor {

    private int sensorRead;

    public StandardSensor(int sensorReading) {
        this.sensorRead = sensorReading;
    }

    @Override
    public void setOn() {
        return;
    }

    @Override
    public void setOff() {
        return;
    }

    @Override
    public boolean isOn() {
        return true;
    }
    
    @Override
    public int read() {
        return sensorRead;
    }
}
