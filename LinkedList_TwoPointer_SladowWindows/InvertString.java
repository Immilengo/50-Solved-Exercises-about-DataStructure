import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class InvertString{

    public static String invert(String arg){
        char[] nome = arg.toCharArray();
        int inicio = 0;
        int fin = nome.length - 1;
        char aux;
        for(int i = 0; i < nome.length/2; i++){
            if (inicio < fin) {
                aux = nome[fin];
                nome[fin] = nome[inicio];
                nome[inicio] = aux;                              
            }
                inicio++;
                fin --;
        }
        return Arrays.toString(nome);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        String nome;

        nome = in.nextLine();
        out.println(invert(nome));

        in.close();
        out.flush();
    }
}
