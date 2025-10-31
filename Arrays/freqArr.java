import java.util.*;
public class freqArr {
    public static void main(String[] args) {
        int[] arr= {1,1,2,4,2,1,2,5,4,4,420,3,3};
        Arrays.sort(arr);
        int count = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1])
                count++;
            else {
                System.out.println(arr[i] + " is repeated " + count + " times");
                count = 1;
            }
        }
        System.out.println(arr[arr.length - 1] + " is repeated " + count + " times");
    }
}
