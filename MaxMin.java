import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaxMin {
    public static void main(String[] args) throws IOException{
        PrintWriter out=new PrintWriter(System.out);
        List<Integer> num= Arrays.asList(4, 2, 9, -1, 7);
        Collections.sort(num);
        out.println(num.get(0));
        out.println(num.get(num.size()-1));
        num.stream().sorted(Comparator.naturalOrder());
    /*9. Contagem de palavras
    Implemente uma função que receba uma string e 
    retorne um dicionário com a contagem de cada 
    palavra. */
    String palavra= "eu gosto de python e gosto de aprender";
    String[] dicionario = palavra.split(" ");
    for(String s : dicionario)
        out.print('"'+s+'"'+", ");
    out.println();

    /*10. Frequência de elementos
    Dado um array de inteiros, retorne o número que 
    mais aparece (modo) e quantas vezes ele aparece. */
    List<Integer> numbers=Arrays.asList(1, 2, 2, 3, 1, 2, 4);
    numbers.sort(null);
    int choosen=numbers.get(0);
    int mais_repetido_ate_agora=choosen;
    int quantas_vezes_se_repetiu=0;
    int frequency=0;
    for(Integer n:numbers){
        if(n==choosen){
            frequency++;
        }else{
            if(quantas_vezes_se_repetiu<frequency){
                quantas_vezes_se_repetiu=frequency;
                mais_repetido_ate_agora=choosen;
            }
            frequency = 0;
            choosen = 0;
        }
    }
    out.println(mais_repetido_ate_agora);
    out.println(quantas_vezes_se_repetiu);
    out.println();
    /*numbers.stream().sorted().forEach(n ->{
        if(n==choosen)
            frequency=frequency+1;
    });   */ 

    /*11. Soma acumulada
    Crie uma função que receba uma lista de inteiros 
    e retorne uma nova lista onde cada posição i contém
    a soma de todos os elementos de 0 até i. */
    /*int[] nov = {1,2,3};
    int[] nova= posicao(nov);
    for (int i : nova) {
        out.println(i + " ");
    }*/
    out.println(mdc(12,11));
    out.println(mmc(12,11));

    //////////////////
    //List<Integer> casos=Arrays.asList(1,2,3);
    //casos.removeIf(n->n%2==0);
    //out.println(casos);

    ///////////////
    int target=9;
    int[] p={1,3,5,6,7,2};
    out.println(two_sums(p, target)[0] +" "+ two_sums(p, target)[1]);
    
    out.flush();        
    }

    static int[] two_sums(int[] nums,int target){
        Map<Integer,Integer> sums=new HashMap<>();
        
        for (int i = 0; i < nums.length; i++)
        {
            int complement = target -  nums[i];
            if (sums.containsKey(complement))
                 return new int[]{sums.get(complement), i};
            sums.put(nums[i], i);
        }
        throw new IllegalArgumentException("Two sum numbers not found");    
    }

    static int mdc(int a,int b){
        return b == 0 ? a:mdc(b, a%b);
    }
    static int mmc(int a,int b){
        return a/mdc(a,b)*b;
    }
    /*static int[] posicao(int[] lista)
    {
        int i = 0;
        
        while(lista[i] != '\0'){
            for(int j = 0; j < i; j++)
                lista[i] += lista[j];
            i++;
        }
        return lista;
    } */
    
}
