import java.util.*;

public class groupAnagrams {
    public static void main(String[] args) {
        String[] words = {"act", "cat", "dog", "god", "tac"};
        int n = words.length;
        boolean[] vis = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!vis[i]) {//start new group
                System.out.print("Group : " + words[i]);
                vis[i] = true;

                for (int j = i + 1; j < n; j++) {
                    if (!vis[j] && checkAnagrams(words[i], words[j])) {
                        System.out.print(" , " + words[j]);
                        vis[j] = true;
                    }
                }
                System.out.println();
            }
        }
    }

    static boolean checkAnagrams(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;

        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);

        return Arrays.equals(c1, c2);
    }
}