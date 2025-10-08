import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class simpleBFS{
    public static boolean isReachable(
    Map<String, Set<String>> grap,
    String start,
    String end
    )
    {
        if(!grap.containsKey(start) || !grap.containsKey(end))
            return false;
        Set<String> visitados = new HashSet<>();
        Queue<String> porVisitar = new LinkedList<>();

        porVisitar.offer(start);
        while (!porVisitar.isEmpty())
        {
            String actual = porVisitar.poll();

            if (actual.equals(end))return true;

            for(String s : grap.getOrDefault(actual, Collections.emptySet()))
                if (!visitados.contains(s)){
                    visitados.add(s);
                    porVisitar.offer(s);  
                }         
        }
        return false;
    }
    public static void main(String[] argumentos){
        Map<String, Set<String>> estacao = new HashMap<>();
        estacao.put("A", Set.of("B","C","D"));
        estacao.put("D", Set.of("E","A"));
        estacao.put("B", Set.of("A","F","C","H"));
        estacao.put("F", Set.of("B"));
        estacao.put("H", Set.of("B"));
        estacao.put("C", Set.of("A","B"));
        estacao.put("E", Set.of("D"));
        System.out.println(isReachable(estacao, "A", "H"));
    }
}