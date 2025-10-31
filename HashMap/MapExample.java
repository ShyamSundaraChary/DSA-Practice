import java.util.*;
public class MapExample {
    public static void main(String[] args) {
        // Example usage of the Map class
        Map<String,Integer> map = new HashMap<>();

        map.put("apple" , 5);
        map.put("mango",10);
        map.put("banana", 15);

        System.out.println("check if key exists: " + map.containsKey("apple"));
        System.out.println("check if value exists: " + map.containsValue(5));
        System.out.println("get value for key: " + map.get("apple"));
        System.out.println("size of map: " + map.size());
        System.out.println("remove key: " + map.remove("apple"));
        System.out.println("size of map after removal: " + map.size());
        System.out.println("Iterating through map:");
        // Iterating through the map
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        // Clear the map
        map.clear();
        System.out.println("size of map after clearing: " + map.size());
        
        // Check if the map is empty
        if (map.isEmpty()) {
            System.out.println("map is empty");
        }
        else {
            System.out.println("map is not empty");
        }
        // Example of using a TreeMap
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("apple", 5);
        treeMap.put("mango", 10);
        treeMap.put("banana", 15);
        System.out.println("TreeMap contents:");
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
    }
}