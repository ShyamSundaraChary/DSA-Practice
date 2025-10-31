class train{
    public static void main(String[] args){
        int arr[]= {900,940,950,1100,1500,1800};
        int dep[]= {910,1200,1130,1900,2000};
        int count=1;
        int end_time =dep[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i] > end_time){
                count++;
                end_time = dep[i];
            }
        }
        System.out.println(count);
    }
}