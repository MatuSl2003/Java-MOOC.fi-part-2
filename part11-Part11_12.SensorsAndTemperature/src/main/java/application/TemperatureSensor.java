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
import java.util.Random;
public class TemperatureSensor implements Sensor {

    private int sensorRead;
    private boolean isItOn;

    public TemperatureSensor() {
        
    }
    
    @Override
    public boolean isOn() {
        return this.isItOn;
    }
    
    @Override
    public void setOn() {
        isItOn = true;
    }

    @Override
    public void setOff() {
        isItOn = false;
    }

    @Override
    public int read() {
     if(isItOn) {
         Random random = new Random();
         int temperature = random.nextInt(61) -30;
         return temperature;
     } else {
         throw new IllegalStateException();
     }
    }
        
}
