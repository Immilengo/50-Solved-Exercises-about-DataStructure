import java.util.Set;
import java.util.Map;
import java.util.Queue;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class BFS {
    public static Boolean RotaPossível(
        Map<String,Set<String>> graph,
        String start,
        String end
    ){
        if(!graph.containsKey(end) || !graph.containsKey(start))
            return false;
        Set<String> visitados = new HashSet<>();
        Queue<String> porVisitar = new LinkedList<>();

        visitados.add(start);
        porVisitar.offer(start);

        while(!porVisitar.isEmpty()){
            String actual = porVisitar.poll();
            if(actual.equals(end)) return true;

            for(String vizinhos : graph.getOrDefault(actual,new HashSet<>())){
                if(!visitados.contains(vizinhos)){
                    porVisitar.offer(vizinhos);
                    visitados.add(vizinhos);
                }
            }

        }
        return false;
    }

    public static void main(String[] args) {
        Map<String,Set<String>> path = new HashMap<>(Map.of("A",Set.of("B")));
        path.put("B", Set.of("A"));
        System.out.println(RotaPossível(path, "A", "C"));
    }
}
