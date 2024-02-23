
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(4);
        numbers.add(-1);
        numbers.add(6);
        numbers.add(-3);
                
        System.out.println(positive(numbers));
        
    }
    
    public static List<Integer> positive(List<Integer> numbers) {
        List<Integer> positive = numbers.stream()
                .filter(value -> value > 0)
                .collect(Collectors.toCollection(ArrayList::new));
        
        return positive;
    }
}
