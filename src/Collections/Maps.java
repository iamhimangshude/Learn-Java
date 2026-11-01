package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Maps {
    public static void main(String[] args) {
        // Map<String, Integer> results = new HashMap<>(); // unsorted
        Map<String, Integer> results = new TreeMap<>(); // sorted in natural order by default (or custom comparator sort)

        results.put("Himangshu", 93);
        results.put("Shubhradeep", 81);
        results.put("Snehasish", 92);
        results.put("Rohit", 69);

        System.out.println(results);
        System.out.println(results.get("Sristhi")); // returns null if key doesn't exist, value otherwise
        System.out.println(results.containsKey("Sristhi")); // returns true if value exists, false otherwise
        System.out.println(results.containsValue(100)); // returns true if value exists, false otherwise
        System.out.println(results.keySet()); // returns set of all keys!
        System.out.println(results.values()); // returns the values
        
        // printing keys in traditional way:
        System.out.println("Marks (in traditional way):");
        Set<String> keys = results.keySet();
        for (String key: keys){
            System.out.println(key + ": " + results.get(key));
        }
        
    }
}
