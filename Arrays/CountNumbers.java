import java.util.Scanner;
import java.util.Arrays;
public class CountNumbers {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9,10};
        System.out.println("The array is: "+ Arrays.toString(arr));
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to count greater than: ");
        int n = sc.nextInt();
        int cnt= CountGreaterThanN(arr, n);
        System.out.println("The count of numbers greater than 5 is: " + cnt);
        sc.close();
    }

    public static int CountGreaterThanN(int[] arr, int n) {
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > n) {
                cnt++;
            }
        }
        return cnt;
    }
}