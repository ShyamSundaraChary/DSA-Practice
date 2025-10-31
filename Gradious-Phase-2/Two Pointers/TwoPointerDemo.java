class TwoPointerDemo
{
    static void twoSum(int[] arr,int target)
    {
        int left = 0, right = arr.length - 1;
        while(left < right)
        {
            int sum = arr[left] + arr[right];
            if(sum == target){
                System.out.print("Target found at index "+left +" and "+right);
                return;
            }
            else if(sum > target) right--;
            else left++;
        }
    }

    public static void main(String...args)
    {
        int[] arr ={1,2,3,4,5,6,7,8,9};
        for(int num : arr){
            System.out.print(num+" ");
        }
        System.out.println();
        twoSum(arr,11);
    }
}