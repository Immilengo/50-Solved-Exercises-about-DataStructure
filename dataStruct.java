import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import java.math.*;

public class dataStruct {
    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException{
        PrintWriter out = new PrintWriter(System.out);

        List<Integer> list=Arrays.asList(15,18,6,74);
        String  nome=new String();
        nome = "Immilengo";
        
        Collections.sort(list);
        Collections.reverse(list);
        out.println(nome.compareTo("Imm"));
        //out.println(
          //  nome.charAt(1) == 'm' ? nome.substring(2):nome.split("i")
        //    );
        list.stream().sorted().forEach(n -> {out.print(n + " ");});
       // out.println(list);
        out.println();
        int[] num=new int[5];
        num[1]=5;
        num[0]=6;
        num[2]=3;
        num[4]=4;
        num[3]=1;
       //out.println(Math.abs(-15.03));
        for(int n:num)
            out.print(n + " ");
        out.println();

        Set<String> nomes=new LinkedHashSet<>();
        nomes.add("Inácio");
        nomes.add("Mazanga");
        nomes.add("Milengo");
        nomes.add("MImmileng");
        nomes.add("Inácio");
        nomes.stream()
             .filter(s -> s.startsWith("M"))
             .filter(s -> s.endsWith("ngo"))
             .forEach(s -> {
                out.println(
                    s.endsWith("ngo") == true ? s:"Nenhum Nome Condiz"
                );
             });
        //nomes.stream.filter().forEach(out::println);

        

        out.flush();
    }
}
