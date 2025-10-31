import java.util.Arrays;
class countPairs{
    static int[][] countpairs(int[] arr){
        Arrays.sort(arr);
        int n= arr.length;
        int[] vis = new int[n];
        int[][] ans= new int[n/2][2];
        int ind=0;

        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if((arr[i]+arr[j] == 0)&& vis[j] == 0){
                    ans[ind][0] = arr[i];
                    ans[ind][1] = arr[j];
                    ind++;
                    vis[j]=0;
                    break;
                }
            }
        }
        int[][] newAns = new int[ind][2];
        for(int i=0;i<ind;i++){
            for(int j=0;j<2;j++){
                newAns[i][j] = ans[i][j];
            }
        }
        return newAns;
    }
    public static void main(String[] args){
        int[] arr= {6,1,8,0,4,-9,-1,-10,-6,-5};
        System.out.println(Arrays.toString(arr));
        int ans[][] = countpairs(arr); 
        for(int i=0;i<ans.length;i++){
             System.out.println(Arrays.toString(ans[i]));
        }
    }
}