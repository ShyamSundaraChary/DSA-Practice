import java.util.Arrays;
public class CheckGreater {
    public static void main(String[] args) {
        // int[] arr = {45,300,1000,20,420};
        // System.out.println("The array is: \n"+ Arrays.toString(arr));
        // boolean check[] = new boolean[arr.length];
        // int num=arr[0];
        // for(int i:arr){
        //     if(i>num){
        //         num=i;
        //     }
        // }
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]==num){
        //         check[i]=false;
        //     }
        //     else check[i]=true;
        // }
        // System.out.println(Arrays.toString(check));



        // printing only right side greater elemts with how many elements are greater than it.
        //int[] arr = {45,300,1000,20,420};
        // System.out.println("The array is: \n"+ Arrays.toString(arr));
        // int check[] = new int[arr.length];
        // for(int i=0;i<arr.length;i++){
        //     int count=0;
        //     for(int j=i+1;j<arr.length;j++){
        //         if(arr[j]>arr[i]) count++;
        //     }
        //     check[i]=count; 
        // }  
        // System.out.println("The count of greater elements on right side is: \n"+Arrays.toString(check));



        // merge two sorted arrays and print the merged array in sorted order.
        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {2, 4, 6, 8, 10};
        int n=arr1.length;
        int m=arr2.length;
        int[] arr=new int[n+m];

        int left=0,right=0,index=0;
        while(left <n && right < m){
            if(arr1[left] < arr2[right]) arr[index++]=arr1[left++];
            else arr[index++]=arr2[right++];
        }
        while(left < n){
            arr[index++]=arr1[left++];
        }
        while(right < n){
            arr[index++]=arr2[right++];
        }
        System.out.println(Arrays.toString(arr));
    }
}