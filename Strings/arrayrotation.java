public class arrayrotation {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5}; // Example array
        int steps = 2; // Number of rotation steps

        int[] rotatedArray = rotateArray(arr, steps);

        // Print rotated array
        System.out.print("Rotated Array: ");
        for (int num : rotatedArray) {
            System.out.print(num + " ");
        }
    }

    public static int[] rotateArray(int[] arr, int steps) {
        if (arr.length == 0) {
            return arr;
        }

        int[] ans = new int[arr.length];
        steps = steps % arr.length; // handle steps > arr.length

        if (steps < 0) {
            steps = arr.length + steps; // handle negative steps
        }

        for (int i = 0; i < arr.length; i++) {
            ans[(i + steps) % arr.length] = arr[i];
        }

        return ans;
    }
}
