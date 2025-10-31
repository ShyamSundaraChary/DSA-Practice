public class MoveZeros {
    public static void main(String[] args) {
        int[] arr = {1,0,5,0,22};
        // get the zero index
        int n = arr.length , ind = 0;
        while (ind < n && arr[ind] != 0) {
            ind++;
        }
        int zeroIndex = ind;
        for (int i = zeroIndex + 1; i < n; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[zeroIndex];
                arr[zeroIndex] = temp;
                zeroIndex++;
            }
        }
        for (int  num : arr) {
            System.out.print(num +" ");
        }

    }
}