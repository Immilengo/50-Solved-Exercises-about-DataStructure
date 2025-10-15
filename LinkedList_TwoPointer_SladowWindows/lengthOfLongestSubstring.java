import java.util.Map;
import java.util.HashMap;

public class lengthOfLongestSubstring {

    private static int lengthOfLongestSubstring(String s){
        Map<Character,Integer> mapa = new HashMap<>();
        int maxlength = 0;
        int left = 0;

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(mapa.containsKey(c))
                left = Math.max(left, mapa.get(c) + 1);
            mapa.put(c, i);
            maxlength = Math.max(maxlength, i - left + 1);
        }
        return maxlength;
    }

    public static void main(String[] args) {
        String str = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(str));
    }
}
