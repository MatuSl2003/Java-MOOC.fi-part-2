
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("How many random numbers should be printed?");
            int amountOfNums = Integer.valueOf(scanner.nextLine());
            Random randomObj = new Random();
            
            for(int i = 0; i < amountOfNums; i++) {
                int randomNumber = randomObj.nextInt(11);
                System.out.println(randomNumber);
            }
        }
    }

}
