public class StringProblem {
    public static boolean revAndCompare(String s, String t){
        char[] convert = s.toCharArray();
        int i = s.length() - 2;
        int j = s.length() - 1;

        while (i > 0) {
            convert[i] ^= convert[i - 1];
            convert[i - 1] ^= convert[i];
            convert[i] ^= convert[i - 1];
            i--;
            ////////////////////////////
            convert[j] ^= convert[j - 1];
            convert[j - 1] ^= convert[j];
            convert[j] ^= convert[j - 1];
            j--;                      
        }
        String copy = new StringBuilder().append(convert).toString();
        System.out.println(convert);
        return t.equals(copy);
    }
    public static void main(String[] args) {
        System.out.println(revAndCompare("tokyo", "kyoto"));
    }
}
