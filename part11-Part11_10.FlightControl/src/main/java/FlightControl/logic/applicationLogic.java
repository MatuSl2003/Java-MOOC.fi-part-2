/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.logic;

/**
 *
 * @author mateo
 */
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import FlightControl.domain.Airplane;
import FlightControl.domain.Flight;

public class applicationLogic {

    private Map<String, Airplane> airplanes;
    private Map<String, Flight> flights;

    public applicationLogic() {
        this.airplanes = new HashMap<>();
        this.flights = new HashMap<>();
    }
    
    public void addAirplane(String id, int capacity) {
        Airplane airplane = new Airplane(id, capacity);
        this.airplanes.put(airplane.toString(), airplane);
    }
    
    public void addFlight(Airplane airplane, String departure, String arrival) {
        Flight flight = new Flight(airplane, departure, arrival);
        this.flights.put(flight.toString(), flight);       
    }

    public Map<String, Airplane> getAirplanes() {
        return airplanes;
    }
    
    public Map<String, Flight> getFlights() {
        return flights;
    }
    
    
    
    

}
