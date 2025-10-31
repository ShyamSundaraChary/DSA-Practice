public class ReverseDemo {
    public static void main(String[] args) {
        // int[] arr = { 10,20,30,40,50 };
        // int left = 0, right = arr.length - 1;
        // while (left < right) {
        //     int temp = arr[left];
        //     arr[left] = arr[right];
        //     arr[right] = temp;
        //     left++;
        //     right--;
        // }
        // for (int num : arr) {
        //     System.out.print(num + " ");
        // }
        // System.out.println();
        String str = "abcde";
        char ch[] = str.toCharArray();
        int left = 0, right = ch.length - 1;
        while (left < right) {
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;
        }
        String s = new String(ch);
        System.out.println(s);
    }
}
