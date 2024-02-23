
import java.util.ArrayList;
import java.util.Collections;

public class MainProgram {

    public static void main(String[] args) {
        ArrayList<Human> humans = new ArrayList<>();
        humans.add(new Human("Matti", 150000));
        humans.add(new Human("Merja", 500));
        humans.add(new Human("Pertti", 80));

        System.out.println(humans);
        

        /*
         * Uncomment the comment below when you have completed the compareTo-method.
         */
        
//        If the "this" object comes before the object received as a parameter in terms of sorting order,
//        the method should return a negative number. If, on the other hand, the "this" object comes after the object received as a parameter,
//        the method should return a positive number. Otherwise, 0 is returned.
        Collections.sort(humans);
        System.out.println(humans);

    }
}
