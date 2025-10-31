public class pattern{
    public static void main(String[] args) {
        int n = 6; 
        String s= "1";

        System.out.println(s); 

        for (int i = 1; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            int count = 1;
            char ch = s.charAt(0);

            for (int j = 1; j < s.length(); j++) {
                char curr = s.charAt(j);
                if (curr == ch) {
                    count++;
                } else {
                    sb.append(count).append(ch);
                    count = 1;
                    ch = curr;
                }
            }
            sb.append(count).append(ch); 

            s = sb.toString();
            System.out.println(s);
        }
    }
}