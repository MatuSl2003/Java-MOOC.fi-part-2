/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.User;

/**
 *
 * @author mateo
 */
import java.util.Scanner;
import FlightControl.logic.applicationLogic;
import FlightControl.domain.Airplane;
import FlightControl.domain.Flight;

public class UI {

    private Scanner scanner;
    private applicationLogic flightControl;

    public UI(Scanner scanner) {
        this.scanner = scanner;
        this.flightControl = new applicationLogic();
    }

    public void start() {
        System.out.println("Airport Asset Control");
        System.out.println("--------------------");
        System.out.println();
        while (true) {
            System.out.println("Choose an action:");
            System.out.println("[1] Add an airplane");
            System.out.println("[2] Add a flight");
            System.out.println("[x] Exit Airport Asset Control");
            System.out.print("> ");
            String command = scanner.nextLine();

            if (command.equals("1")) {
                System.out.print("Give the airplane id: ");
                String airplaneId = scanner.nextLine();
                System.out.print("Give the airplane capacity: ");
                int capacity = Integer.valueOf(scanner.nextLine());
                flightControl.addAirplane(airplaneId, capacity);

            } else if (command.equals("2")) {
                System.out.print("Give the airplane id: ");
                String airplaneId = scanner.nextLine();
                boolean planeWithId = flightControl.getAirplanes().values().stream()
                        .map(airplane -> airplane.getID())
                        .anyMatch(id -> id.equals(airplaneId));
                if (!planeWithId) {
                    System.out.println("No airplane with the id " + airplaneId + ".");
                } else {
                    System.out.print("Give the departure airport id: ");
                    String departure = scanner.nextLine();
                    System.out.print("Give the target airport id: ");
                    String arrival = scanner.nextLine();
                    for (Airplane airplane : flightControl.getAirplanes().values()) {
                        if (airplane.getID().equals(airplaneId)) {
                            flightControl.addFlight(airplane, departure, arrival);
                            break;
                        }
                    }
                }
            } else if (command.equals("x")) {
                break;
            }
        }

        System.out.println("Flight Control");
        System.out.println("------------");
        System.out.println();
        while (true) {

            System.out.println("Choose an action:");
            System.out.println("[1] Print airplanes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print airplane details");
            System.out.println("[x] Quit");
            System.out.print("> ");
            String command = scanner.nextLine();

            if (command.equals("1")) {
                printAirplanes();
            } else if (command.equals("2")) {
                printFlights();
            } else if (command.equals("3")) {
                System.out.print("Give the airplane id: ");
                String airplaneId = scanner.nextLine();
                printSinglePlane(airplaneId);
            } else if (command.equals("x")) {
                break;
            }
        }

    }

    private void printAirplanes() {
        flightControl.getAirplanes().keySet().stream()
                .forEach(airplaneString -> System.out.println(airplaneString));
    }

    private void printFlights() {
        flightControl.getFlights().keySet().stream()
                .forEach(flightString -> System.out.println(flightString));
    }

    private void printSinglePlane(String airplaneId) {
        for (Airplane airplane : flightControl.getAirplanes().values()) {
            if (airplane.getID().equals(airplaneId)) {
                System.out.println(airplane);
            }
        }
    }

}
