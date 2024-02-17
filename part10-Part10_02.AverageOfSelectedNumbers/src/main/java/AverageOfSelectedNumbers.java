
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your program here
        List<String> numbers = new ArrayList<>();
        System.out.println("Input numbers, type \"end\" to stop.");

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            numbers.add(input);
        }
        System.out.println("");
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String np = scanner.nextLine();
        if (np.equals("p")) {
            double average = numbers.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(s -> s >= 0)
                    .average()
                    .getAsDouble();
            System.out.println("Average of the positive numbers: " + average);

        } else {
            double average = numbers.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(s -> s < 0)
                    .average()
                    .getAsDouble();
            System.out.println("Average of the negative numbers: " + average);

        }

    }
}
