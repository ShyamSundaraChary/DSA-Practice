import java.util.Scanner;

class Solution {
    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] mapS = new int[256]; // For characters in s
        int[] mapT = new int[256]; // For characters in t

        for (int i = 0; i < s.length(); i++) {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            if (mapS[ch1] != mapT[ch2]) {
                return false;
            }

            // Mark the characters as visited with index+1 (to differentiate from default 0)
            mapS[ch1] = i + 1;
            mapT[ch2] = i + 1;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string s: ");
        String s = sc.nextLine();
        System.out.print("Enter string t: ");
        String t = sc.nextLine();

        if (isIsomorphic(s, t)) {
            System.out.println("The strings are isomorphic.");
        } else {
            System.out.println("The strings are NOT isomorphic.");
        }
    }
}
