import java.util.Arrays;

public class frequencySort {
    public static String frequencySort(String s) {
        char[] c = s.toCharArray();
        Arrays.sort(c);
        return  String.copyValueOf(c);
    }
    public static void main(String[] args) {
        System.out.println(frequencySort("tree"));
    }
}
