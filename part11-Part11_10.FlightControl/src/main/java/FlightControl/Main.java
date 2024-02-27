package FlightControl;

import java.util.Scanner;
import FlightControl.User.UI;
public class Main {

    public static void main(String[] args) {
        // Write the main program here. It is useful to create some classes of your own.
        Scanner scanner = new Scanner(System.in);
        UI user = new UI(scanner);
        user.start();
        
    }
}
