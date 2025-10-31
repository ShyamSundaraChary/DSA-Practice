public class LongestPrefix {
    public static void main(String[] args) {
        String[] words = {"app", "apple","approx"};
        System.out.println(longestCommonPrefix(words));
    }

    public static String longestCommonPrefix(String[] strs) {

        String prefix = strs[0];

        for(int i=1;i<strs.length;i++){
            int j=0;
            while(j<prefix.length() && j < strs[i].length() && prefix.charAt(j) == strs[i].charAt(j)){
                j++;
            }
            prefix = prefix.substring(0,j);
            if(prefix == "") return "No Prefix";
        }

        return prefix;
    }
}