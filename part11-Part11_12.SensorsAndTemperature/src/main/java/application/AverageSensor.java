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
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class AverageSensor implements Sensor {

    
    private List<Integer> reads;
    private List<Sensor> sensors;

    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.reads = new ArrayList<>();
    }

    public void addSensor(Sensor toAdd) {
        this.sensors.add(toAdd);
    }

    @Override
    public boolean isOn() {
        for (Sensor sensor : sensors) {
            if (sensor.isOn() == false) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void setOn() {
        this.sensors.stream()
                .forEach(sensor -> sensor.setOn());
        this.isOn();
    }

    @Override
    public void setOff() {
        Random random = new Random();
        int randomBinary = random.nextInt(2);
        if (randomBinary == 0) {
            this.sensors.stream()
                    .forEach(sensor -> sensor.setOff());

            this.isOn();

        } else {
            for (Sensor sensor : sensors) {
                if (sensor instanceof TemperatureSensor) {
                    sensor.setOff();
                    this.isOn();
                    break;
                }
            }
        }
    }

    @Override
    public int read() {
        if (isOn() || !sensors.isEmpty()) {
            int sum = 0;
            for (int i = 0; i < sensors.size(); i++) {
                sum += sensors.get(i).read();
            }
            int average = sum / sensors.size();
            this.reads.add(average);
            return average;

        } else {
            throw new IllegalStateException();
        }
    }

    public List<Integer> readings() {
        return this.reads;

    }

}
