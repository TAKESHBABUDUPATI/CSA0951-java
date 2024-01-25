 import java.util.ArrayList;

public class ListArray {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println("Elements in the ArrayList:");
        for (String car : cars) {
            System.out.println(car);

        }
    }
}
