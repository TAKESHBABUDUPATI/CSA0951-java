import java.util.Vector;

public class VectorList {
    public static void main(String[] args) {
        Vector<String> cars = new Vector<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println("Elements in the Vector:");
        for (String car : cars) {
            System.out.println(car);
        }

    }
}
