import java.util.Arrays;
public class StringCount {
    public static void main(String[] args) {
            String str = "aaaaaabbfgwbbbcccccc";           
            StringBuilder sb = new StringBuilder();
            int cnt=1;

            for (int i = 1; i < str.length(); i++) {
                if(str.charAt(i) == str.charAt(i-1)){
                    cnt++;
                }else{  
                    sb.append(str.charAt(i-1)).append(cnt);
                    cnt=1;
                }
            }
            sb.append(str.charAt(str.length()-1)).append(cnt); 
            System.out.println(sb.toString());

    }

    }