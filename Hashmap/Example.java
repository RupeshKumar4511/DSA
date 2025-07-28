package Hashmap;

import java.util.HashMap;
import java.util.Map;

public class Example {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        // Adding entries
        map.put("apple", 3);
        map.put("banana", 5);

        // Accessing values
        System.out.println(map.get("apple")); // 3

        // Checking existence
        System.out.println(map.containsKey("banana")); // true
        System.out.println(map.containsValue(5)); // true

        // Iterating over entries
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Removing an entry
        map.remove("apple");

        // Size of the map
        System.out.println(map.size()); // 1
    }
}
