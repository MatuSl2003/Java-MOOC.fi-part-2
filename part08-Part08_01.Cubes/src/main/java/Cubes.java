
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String number = scanner.nextLine();
            if (number.equals("end")) {
                break;
            }
            try {
                int number1 = Integer.valueOf(number);
                int cube = number1 * number1 * number1;
                System.out.println(cube);
            } catch (Exception e) {
                System.out.println("Error: Please enter an integer  or ´end´ ");
            }
        }
    }
}
