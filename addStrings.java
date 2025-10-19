import java.math.BigInteger;

public class addStrings {
     public String addStrings(String num1, String num2) {
        BigInteger a = new BigInteger(num1);
        BigInteger b = new BigInteger(num2);
        return a.add(b).toString();
        // return Integer.toString(Integer.parseInt(num1) + Integer.parseInt(num2));
    }
}
