import java.util.Scanner;

public class tooManyReq {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int n = ler.nextInt();
    int m = ler.nextInt();

    int i = 1;
    while (i <= n) {
        System.out.println
        (
          i <= m 
          ? "OK"
          : "Too Many Requests"
        );
        i++;
    }
    ler.close();
  }
}
