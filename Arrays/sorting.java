import java.util.*;
public class sorting{
    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1,0};
        int n=6;
        int cnt=0;
        System.out.println("Array: "+Arrays.toString(arr));
        for(int i = 0 ; i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    swap(arr,i,j);
                    cnt++;
                }
        }
    }
    System.out.println("Number of swaps: "+cnt);
    System.out.println("Sorted array: "+Arrays.toString(arr));
    }
public static void swap(int arr[],int i,int j){
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}
}