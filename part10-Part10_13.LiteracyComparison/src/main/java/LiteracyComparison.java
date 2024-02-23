
import java.nio.file.Files;
import java.nio.file.Paths;

public class LiteracyComparison {

    public static void main(String[] args) {
        
        try {
            Files.lines(Paths.get("literacy.csv"))
                    .map(row -> row.split(","))
                    .map(parts -> new LiteracyMeasure(parts[3], Integer.valueOf(parts[4]), parts[2].split(" ")[1], Double.parseDouble(parts[5])))
                    .sorted((lm1, lm2) -> {
                        return lm1.compareTo(lm2);
                    })
                    .forEach(measurement -> System.out.println(measurement));

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
//parts[2] = gender; parts[3] = country; parts[4] = year;
//parts[5] = literacyrate;
