import java.util.Arrays;
 class checkArrays{
    public static void main(String[] args){
        int[] arr1= {1,2,5,4,0};
        int[] arr2={2,4,5,0,1};
        System.out.println(check(arr1,arr2));
    }
    static boolean check(int[] arr1,int[] arr2){
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(arr1.length != arr2.length) return false;
        for(int i=0;i<arr1.length;i++){
            if(arr1[i] != arr2[i]) return false;
        }
        return true;
   } 
}