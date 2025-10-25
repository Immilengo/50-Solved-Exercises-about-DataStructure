import java.util.Scanner;

public class Main {
  public static boolean isPossible(int[] vet, int m) {
    int soma = 0;
    int i = 0;
    while (i < vet.length) {
      soma += vet[i];
      i++;
    }

    int j = 0;
    while (j < vet.length) {
      if ((soma - vet[j]) == m)
        return true;
      j++;
    }

    return false;
  }

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int n = ler.nextInt();
    int m = ler.nextInt();

    int[] vet = new int[n];
    int i = 0;
    while (i < n) {
      vet[i] = ler.nextInt();
      i++;
    }

    if (isPossible(vet, m))
      System.out.println("Yes");
    else
      System.out.println("No");

    ler.close();
  }
}
