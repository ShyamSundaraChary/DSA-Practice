public class MinNum {
    public static void main(String[] args) {
        int[] arr = {10,4,15,2,30};
        // int index =0;
        // int min = findMin(arr,index);
        // System.out.println("The minimum number is: " + min+"\nits index is: "+index);

        // int sum = findSum(arr);
        // System.out.println("The sum of the array is: " + sum);

        // findLargestAnd2ndLargest(arr);
        int oddCount = CountOddFunction(arr);
        System.out.println("odd numbers in array is: " + oddCount);
        
        
    }

    public static int CountOddFunction(int[] arr) {
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                cnt++;
            }
        }
        return cnt;
    }

    public static int findSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int findMin(int[] arr,int index) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                index = i;
            }
        }
        return min;
    }
    public static void findLargestAnd2ndLargest(int []arr){
        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;
        int index1 = -1, index2 = -1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                index2 = index1;
                largest = arr[i];
                index1=i;
            } 
            else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
                index2=i;
            }
        }
        System.out.println("The largest number is: " + largest + "\t index is: " + index1);
        System.out.println("The second number is: " + secondLargest + "\t index is: " + index2);
    }
    
}