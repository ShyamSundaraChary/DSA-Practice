import java.util.Arrays;
public class Palindrome{
    public static void main(String[] args) {
        // checkign palindrome using string builder
    
        String  str = "Race car";
        str = str.toLowerCase().replace(" ","");
        char[] arr = str.toCharArray();
        int start = 0, end = arr.length-1;
        boolean isPalindrome = true;
        while(start < end){
            if(arr[start] != arr[end]){
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }
        if(isPalindrome) System.out.print("Palindrome");
        else System.out.print("not palindrome");

    }
}