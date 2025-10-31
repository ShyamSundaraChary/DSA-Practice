public class encrypt {
    public static void main(String[] args) {
        String str = "having a nice day";

        int size = 4;
        str = str.replaceAll(" ", "");

        int len = str.length();
        int n = (int)(len / size)+1; 

        String[] words = new String[n];

        int index = 0;
        for (int i = 0; i < len; i += size) {
            if(i + size <= len){
                words[index] = str.substring(i, i + size);
            } else {
                words[index] = str.substring(i); // last row 
            }
            index++;
        }

        // Print column wise
        for (int col = 0; col < size; col++) {
            for (int row = 0; row < n; row++) {
                if (col < words[row].length()) {
                    System.out.print(words[row].charAt(col));
                }
            }
            System.out.print(" ");
        }
    }
}
