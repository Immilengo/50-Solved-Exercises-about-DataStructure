import java.util.Map;
import java.io.PrintWriter;
import java.util.HashMap;

public class lengthOfLongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> mapa = new HashMap<>();
        int MaxLength = 0;
        int left = 0;

        for(int right = 0; right < s.length(); right++){
            char c = s.charAt(right);
            if(mapa.containsKey(c))
                left = Math.max(left,mapa.get(c)+1);
            mapa.put(c,right);
            MaxLength = Math.max(MaxLength,right - left + 1);
        }
        return MaxLength;
    }

    public static void main(String[] args){
        PrintWriter out = new PrintWriter(System.out);
        out.println(lengthOfLongestSubstring("abcabcbb")); 
        out.flush();
    }
}
