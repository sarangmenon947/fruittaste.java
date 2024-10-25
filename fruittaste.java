import java.util.HashMap;
import java.util.Map;

public class fruittaste {
    public static void main(String[] args) {
        // Creating A HashMap To Store Fruits And Their Tastes
        Map<String, String> fruitTastes = new HashMap<>();

        // Adding Fruits And Their Tastes To This Map
        fruitTastes.put("Apple", "Sweet");
        fruitTastes.put("Grape", "Sour");
        fruitTastes.put("Banana", "Sweet");
        fruitTastes.put("Lemon", "Sour");
        fruitTastes.put("Orange", "Citrus");
        fruitTastes.put("Strawberry", "Sweet");

        // Displaying The Fruits And Their Tastes
        System.out.println("Fruits and their tastes:");
        for (Map.Entry<String, String> entry : fruitTastes.entrySet()) {
            System.out.println(entry.getKey() + " Tastes " + entry.getValue());
        }
    }
}
