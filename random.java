import java.util.Random;
import java.util.Scanner;

public class random {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Random random = new Random();
        int i = random.nextInt(100);
        System.out.println(i);
        int j = ler.nextInt();
        while(1 != 0){
                System.out.println("? " + j);
            if (j > i)
                System.out.println("<");
            if(j < i)
                System.out.println(">");
            if (j == i) {
                System.out.println("=");
                System.out.println("! " + j);
                break;
            }
            j = ler.nextInt();
        }
        ler.close();
    }
}
