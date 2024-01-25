import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("John", 25);
        hashMap.put("Jane", 30);
        hashMap.put("Bob", 22);
        System.out.println("Age of John: " + hashMap.get("John"));
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        if (hashMap.containsKey("Jane")) {
            System.out.println("Jane's age is present in the HashMap.");
        }
        if (hashMap.containsValue(22)) {
            System.out.println("There is a person with age 22 in the HashMap.");
        }
        hashMap.remove("Bob");
        System.out.println("Size of the HashMap: " + hashMap.size());
    }
}
