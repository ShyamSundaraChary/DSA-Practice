import java.util.*;
public class MyStringDemo {
    public static void main(String[] args) {
        demonstrateStringBuilder();


        // List<String> fruitsList = getFruitsList("Apple,Banana,Cherry,Date,Elderberry");
        // System.out.println("Fruits List: " + fruitsList);
        // System.out.println("Fruits List Size: " + fruitsList.size());
        // System.out.println("Fruits List Contains 'Banana': " + fruitsList.contains("Banana"));
        // System.out.println("Fruits List Index of 'Cherry': " + fruitsList.indexOf("Cherry"));
        // System.out.println("Fruits List Sublist (1, 3): " + fruitsList.subList(1, 3));
        // System.out.println("Fruits List After Removing 'Banana': " + fruitsList.remove("Banana"));
        // System.out.println("Fruits List After Removing Index 2: " + fruitsList.remove(2));
        // fruitsList.clear();
        // System.out.println("Fruits List After Clearing: " + fruitsList);
        // System.out.println("Fruits List Size After Clearing: " + fruitsList.size());
        // System.out.println("Fruits List Is Empty: " + fruitsList.isEmpty());

        // System.out.println("Fruits List After Adding 'Grapes': " + fruitsList.add("Grapes"));
        // System.out.println("Fruits List After Adding 'Mango': " + fruitsList.add("Mango"));
        // System.out.println("Fruits List After Adding fruits: " + fruitsList);

    }
    public static void demonstrateStringBuilder() {
        StringBuilder sb = new StringBuilder("Hello");

        sb.append(" World");
        System.out.println(sb.toString()); // Hello World, as it appends " World" to "Hello"
        
        sb.insert(5, ",");
        System.out.println(sb.toString()); // Hello, World, as it inserts "," at index 5
        
        sb.replace(5, 6, "!");
        System.out.println(sb.toString()); // Hello! World, as it replaces "," with "!"
        
        sb.deleteCharAt(5);
        System.out.println(sb.toString()); // Hello World, as it deletes the character at index 5
        
        sb.reverse();
        System.out.println(sb.toString()); // dlroW olleH, as it reverses the sequence

        sb.reverse(); // Reversing back to original

        System.out.println(sb.toString()); // Hello World, as it reverses back to original
        System.out.println(sb.indexOf("o")); // 4, as it returns the index of the first occurrence of "o"
        System.out.println(sb.indexOf("lo")); // 3, as it returns the index of the first occurrence of "lo"
        System.out.println(sb.lastIndexOf("o")); // 7, as it returns the index of the last occurrence of "o"
        System.out.println(sb.lastIndexOf("lo")); // 3, as it returns the index of the last occurrence of "lo"
        
        System.out.println(sb.capacity()); // 16, as it returns the current capacity
        
        System.out.println(sb.subSequence(3, 6)); // "lo W", as it returns the substring from index 3 to 6
        
        sb.setLength(5);
        System.out.println(sb.toString()); // Hello, as it sets the length of the StringBuilder to 5
        String str ="abhi";
        sb.replace(0, 5, "pooka"); // Replacing "Hello" with "abhi"
        sb.append(" ").append(str); // Appending a string to StringBuilder
        System.out.println(sb.toString()); // Helloabhi, as it appends "abhi" to "Hello"
    }
    
    public static void printFruits(String s) {
        String[] fruits = s.split(",");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
    
    public static List<String> getFruitsList(String s) {
        
        List<String> fruitsList = new ArrayList<>();
        String[] fruits = s.split(",");
        for (String fruit : fruits) {
            // fruitsList.add(new StringBuilder(fruit).reverse().toString());
            fruitsList.add(fruit); // Adding the fruit directly to the list
        }
        return fruitsList;
    }

    public static void stringMethods() {
        String s1 = new String("Hello World");
        String s2 = new String("Hello World");

        System.out.println(s1.equals(s2));//true, because they are equal
        System.out.println(s1 == s2); // false, because they are different objects
        System.out.println(s1.equalsIgnoreCase(s2)); // true, because they are equal ignoring case
        System.out.println(s1.length()); // 11, because it counts all characters including space
        System.out.println(s1.charAt(0)); // H, because it returns the character at index 0
        System.out.println(s1.indexOf('o')); // 4, because it returns the index of the first occurrence of 'o'
        System.out.println(s1.indexOf("lo")); // 3, because it returns the index of the first occurrence of "lo"
        System.out.println(s1.substring(0, 5)); // Hello, because it returns the substring from index 0 to 5 (exclusive)
        System.out.println(s1.substring(6)); // World, because it returns the substring from index 6 to the end
        System.out.println(s1.toUpperCase()); // HELLO WORLD, because it converts the string to uppercase
        System.out.println(s1.toLowerCase()); // hello world, because it converts the string to lowercase
        System.out.println(s1.trim()); // Hello World, because it removes leading and trailing whitespace
        System.out.println(s1.replace('o', 'a')); // Hella Warld, because it replaces 'o' with 'a'
        System.out.println(s1.startsWith("Hello")); // true, because it starts with "Hello"
        System.out.println(s1.endsWith("World")); // true, because it ends with "World"
        System.out.println(s1.contains("lo")); // true, because it contains "lo"
        System.out.println(s1.concat(" Universe")); // Hello World Universe, because it concatenates the string with " Universe"
    }
}