
import java.nio.file.Paths;
import java.util.Scanner;
import java.io.File;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            UserInterface user = new UserInterface(scanner);
            user.start();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
