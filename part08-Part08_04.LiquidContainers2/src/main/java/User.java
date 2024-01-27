/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mateo
 */
import java.util.Scanner;

public class User {

    private Scanner scanner;
    private Container first;
    private Container second;

    public User(Scanner scan) {
        this.scanner = scan;
        this.first = new Container();
        this.second = new Container();
    }

    public void start() {
        while (true) {
            System.out.println("First: " + first);
            System.out.println("Second: " + second);
            String input = scanner.nextLine();
            System.out.println("");
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (command.equals("add")) {
                first.add(amount);
            } else if (command.equals("move")) {
                if (first.contains() - amount < 0) {
                    amount = first.contains();
                    first.setAmount(0);
                } else {
                    first.remove(amount);
                }
                second.add(amount);
            } else if (command.equals("remove")) {
                second.remove(amount);
            }

        }
    }
}
