public class toHexa {
    public static String toHex(int num) {
        if (num == 0) return "0";

        StringBuilder res = new StringBuilder();
        String hexChars = "0123456789abcdef";

        // converte para valor não assinado de 32 bits
        long n = num & 0xFFFFFFFFL;

        while (n > 0) {
            int dig = (int)(n % 16);
            res.append(hexChars.charAt(dig));
            n /= 16;
        }

        return res.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(toHex(26));
    }
}
