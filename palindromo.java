import java.io.IOException;
import java.io.PrintWriter;

public class palindromo {
    public static void main(String[] args) throws IOException{
       /* System.in: This is the standard input stream that is used to read characters from the keyboard or any other standard input device. Example:
        InputStreamReader inp = new InputStreamReader(System.in);*/ 
        /*2. Verifica palíndromo** Crie uma função que receba uma string e retorne True se ela for um palíndromo (igual lida de trás para frente) e False caso contrário.
        python
        # Exemplo:
        # entrada: "arara"
        # saída: True */
        PrintWriter out=new PrintWriter(System.out);
        String nome="python";      
        out.println(
            verificar_palindromo(nome) == true ? "A palavra " + nome + " é Palindromo"
            :"A palavra " + nome + " não é Palindromo"
        );
        out.println(Math.floor(15.56));
        out.println(Math.ceil(15.56));
        out.println(Math.random());
        out.flush();
    }

    public static boolean verificar_palindromo(String nome){
        String invertida = new StringBuilder(nome).reverse().toString();
        return nome.equals(invertida);
    }
}
