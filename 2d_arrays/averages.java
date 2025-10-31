import java.util.Arrays;
public class averages{
    public static void main(String[] args) {
        int[][] arr = {{30,-30,30}, 
                       {20,0}, 
                       {10,10,10,10}};
        System.out.println("Sum of all elements: " + calculateSum(arr));
        System.out.println("Number of positive elements: " + countPositives(arr));
        System.out.println("Minimum element: " + findMin(arr) );
        countOfSubArrayElements(arr);

}
    

    public static int calculateSum(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }
    public static int countPositives(int[][] arr) {
        int count = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int findMin(int[][] arr) {
        int min = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                min = Math.min(min, arr[i][j]);
            }
        }
        return min;
    }
    public static void countOfSubArrayElements(int[][] arr) {
        int newArr[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i].length;
        }
        System.out.print("Count of elements in each sub-array: "+Arrays.toString(newArr));
}
}