import java.util.ArrayList;
import java.util.Collections;

public class SortedList {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        Collections.sort(cars);
        System.out.println("Elements in the Sorted List:");
        for (String car : cars) {
            System.out.println(car);
        }
    }
}
