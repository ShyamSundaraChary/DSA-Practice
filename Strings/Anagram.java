import java.util.*;
public class Anagram {
    public static void main(String[] args) {
       String str1= "Conversation";
       String str2 = "Voices rant on";
       
    //    method-1 : freq

       int[] count = new int[256];
       for(int i=0;i<str1.length();i++){
            count[str1.charAt(i)]++;
       }
       for(int i=0;i<str2.length();i++){
            int cnt =0;
            for(int j=0;j<str2.length();j++){
                if(str2.charAt(j) == str1.charAt(i)) cnt++;
            }
            if(cnt != count[str1.charAt(i)] ){
                 System.out.print("not anagram");return;
            }
       }
       System.out.print("anagram");

    // methods - 2 :- sorting and checking

    // String str1= "He ll o";
    // String str2 = "Ol le h";
       
    // str1 = str1.toLowerCase().replace(" ","");
    // str2 = str2.toLowerCase().replace(" ","");
    // char[] arr1 = str1.toCharArray();
    // char[] arr2 = str2.toCharArray();
    // Arrays.sort(arr1);
    // Arrays.sort(arr2);
    // if(Arrays.equals(arr1,arr2)) System.out.print("anagram");
    // else System.out.print("not anagram");

    }
}