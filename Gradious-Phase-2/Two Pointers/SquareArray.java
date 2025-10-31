class SquareArray
{
    public static void main(String...args)
    {
        int[] arr ={-4,-1,0,3,10};
        for(int num : arr){
            System.out.print(num+" ");
        }
        System.out.println();
        int n = 5;
        int[] res = new int[n];
        int left = 0, right = n - 1;
        int pos = n - 1;
        while (left < right) {
            if (Math.abs(arr[left]) > arr[right]) {
                res[pos] = arr[left] * arr[left];
                pos--;
                left++;
            } else {
                res[pos] = arr[right] * arr[right];
                pos--;
                right--;
            }
        }
        for (int num : res) {
            System.out.print(num + " ");
        }
    }
}