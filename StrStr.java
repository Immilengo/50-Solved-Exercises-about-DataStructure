import java.util.Scanner;

public class StrStr {
    public static int strStr(String haystack, String needle) {
       if (needle.isEmpty()) return 0;
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            int fin = i + needle.length();
            if (haystack.substring(i, fin).equals(needle))
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String  haystack = "hello", needle = "ll";
        
        System.out.println(strStr(haystack,needle));
        ler.close();
    }
}
