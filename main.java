import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import java.util.stream.Collectors;

public class main{

    public static void main(String[] args) throws IOException{
      // FastReader in = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
        /*1. Contagem de pares** Dado um array de números inteiros, escreva uma função que retorne a quantidade de pares (números divisíveis por 2).
        python
        # Exemplo:
        # entrada: [1, 2, 3, 4, 5, 6]
        # saída: 3 (2, 4, 6) */
        List<Integer> num=Arrays.asList(1,5,6,8,2,7,5,2,5,4,8,6,1,9);
        //int i ="inacio0".hashCode();
       // System.out.println(i);
       /*Thread t1=new Thread(() -> out.println("Tarefa 1"));
       Thread t2=new Thread(() -> out.println("Tarefa 2"));
       t2.start();
       t2.sleep(362);*/

         /*List<Integer> pares =*/num.stream()
                                 .filter( n-> n % 2 == 0)
                                 .distinct()
                                 .sorted()
                                 .map(testeReference::multiplicar)
                                 .forEach(out::print);
                                // .collect(Collectors.toList());
        //Arrays.sort(pares);
        //pares.sort(null);
       //Collections.sort(pares);
       // out.println(pares);
      
        /*2. Verifica palíndromo** Crie uma função que receba uma string e retorne True se ela for um palíndromo (igual lida de trás para frente) e False caso contrário.
        python
        # Exemplo:
        # entrada: "arara"
        # saída: True

        # entrada: "python"
        # saída: False */
        List<Integer> vet= Arrays.asList(1,2,3);
       // vet.hashCode();
       // out.println(vet.hashCode());

        out.flush();
    }
    public class testeReference {

    public static int multiplicar(int a){
        return a * 2;
    }
}
}
    