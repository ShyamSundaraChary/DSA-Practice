import java.util.Arrays;
 class packet_min{
    public static void main(String[] args){
        int[] arr= {3,4,1,9,56,7,9,12};
        System.out.println(Arrays.toString(arr));
        int ans = countPackets(arr); 
        System.out.println(ans);
    }
    static int countPackets(int[] arr){
        Arrays.sort(arr);
        int n=arr.length;
        int left=0,right=4;
        int ans=999999;
        while(right<n){
            int diff = arr[right] - arr[left];
            if(diff < ans){
                ans = diff;
            }
            right++;
            left++;
        }
        return ans;
   } 
}