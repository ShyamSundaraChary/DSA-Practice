import java.util.HashMap;
class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Character, Integer> freq = new HashMap<>();
        String str = "racecar";
        for (char ch : str.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }
        for (char ch : freq.keySet()) {
            System.out.println(ch + " -> " + freq.get(ch));
        }
        }
}