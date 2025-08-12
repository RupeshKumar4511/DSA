package Trees;
import java.util.HashMap;

public class Hashmap {
    


    public static void main(String[] args) {

        // Syntax: HashMap<KeyType, ValueType> map = new HashMap<>();

        HashMap<String, Integer> ages = new HashMap<>();
        ages.put("Alice", 25);
        ages.put("Bob", 30);

        int age = ages.get("Alice"); // returns 25
        System.out.println(age);
    }
}

// Other inbuilt methods:
// put(key, value)	Adds or updates a key-value pair

// get(key)	Retrieves the value for a given key

// remove(key)	Removes the mapping for the specified key

// containsKey(key)	Checks if the key exists

// containsValue(value)	Checks if the value exists

// keySet()	Returns a set of all keys

// values()	Returns a collection of all values

// entrySet()	Returns a set of key-value mappings

// size()	Returns the number of entries

// clear()	Removes all mappings
