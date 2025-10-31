import java.util.*;
public class Problems {
    public static void main(String[] args) {

        //1. find length of string
        int len = findLength("Shyam");
        System.out.println("Length of String: " + len); // 11
        //2.  concatenate two strings
        String str1 = concat("Hello", "World");
        System.out.println("Concatenated String: " + str1); // HelloWorld
        //3.  reverse a string
        String str2 = reverse("Shyam");
        System.out.println("Reversed String: " + str2); // mayhS

        //4. count the words in a string
        int count = countWords("Hello World, I am Shyam");
        System.out.println("The String is : "+ " Hello World, I am Shyam"); // Hello World, I am Shyam
        System.out.println("Count of words: " + count); // 5

        //5. count the vowels in a string
        int Vowels = countVowels("Hello World, I am Shyam");
        System.out.println("Count of vowels: " + Vowels); // 6

        //6. count the occurrences of a character in a string
        System.out.println("Count of occurrences of 'o': " + countOccurrences("Hello World, I am Shyam", 'o'));// 2

       //7. Convert uppercase to lowercase
        String str3 = toLowerCase("Abhi420");
        System.out.println("Converted String: " + str3); // hello world, i am shyam

        // //8. using split method
        // String str4 = splitString("Hello         World    I         am     Shyam");
        // System.out.println("Split String:" + str4); // Hello World, I am Shyam


        //9. print the sentence wiht single space after each word
        String str5 = removeExtraSpaces("abc  def   g");
        System.out.println("Split String:" + str5); 

        //10. print numbers in a string
        String str6 = "abc 123 def 45";
        printNumbers(str6);

    }
    public static int findLength(String str) {
        // int count = 0;
        // for (int i = 0; i < str.length(); i++) {
        //     count++;
        // }
        // return count;
        return str.length();
    }
    public static String concat(String str1, String str2) {
        // return str1 +" "+ str2;
        return str1.concat(" ").concat(str2);
    }
    public static String reverse(String str) {
        // normal method to reverse

        // String reversed = "";
        // for (int i = str.length() - 1; i >= 0; i--) {
        //     reversed += str.charAt(i);
        // }
        // return reversed;

        // String Builder method to reverse
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }
    public static int countWords(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') {
                count++;
            }
        }
        count++; // for the last word
        return count;       
        // String[] words = str.split(" ");
        // return words.length;

        // return str.split(" ").length;

    }
    public static int countVowels(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }
    public static int countOccurrences(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }
    public static String toggleCase(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                ch = Character.toLowerCase(ch);
            } else {
                ch = Character.toUpperCase(ch);
            }
            sb.append(ch);
        }
        return sb.toString();   

    }
    public static String toLowerCase(String str) {
        return str.toLowerCase();
        // StringBuilder sb = new StringBuilder();
        // for (int i = 0; i < str.length(); i++) {
        //     char ch = str.charAt(i);
        //     if (ch >= 'A' && ch <= 'Z') {
        //         ch = (char) (ch + 32);
        //     }
        //     sb.append(ch);
        // }
        // return sb.toString();
    }
    public static String splitString(String str) {
        String[] words = str.split("\\s+"); // split the string at one or more spaces
        return String.join(" ", words); // join the words with a single space
    }
    public static String removeExtraSpaces(String str){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                sb.append(str.charAt(i));
            } else if (i > 0 && str.charAt(i - 1) != ' ') {
                sb.append(' ');
            }
        }
        return sb.toString();
    }
    public static void printNumbers(String str) {
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            if (Character.isDigit(ch)) {
                sb.append(ch);
            } 
            else if (sb.length() > 0 && !Character.isDigit(ch)) {
                numbers.add(Integer.parseInt(sb.toString()));
                sb.setLength(0); // reset
            }
        }
        if (sb.length() > 0) {
            numbers.add(Integer.parseInt(sb.toString()));
        }
        System.out.println("Numbers in the string: " + numbers);
        
    }
    public static void charMethods() {
        char ch = 'a';
        System.out.println(Character.isDigit(ch)); // false
        System.out.println(Character.isLetter(ch)); // true
        System.out.println(Character.isUpperCase(ch)); // false
        System.out.println(Character.isLowerCase(ch)); // true
        System.out.println(Character.toUpperCase(ch)); // A
        System.out.println(Character.toLowerCase(ch)); // a
        System.out.println(Character.getNumericValue(ch)); // 97
        System.out.println(Character.getNumericValue('1')); // 49    
    }

}