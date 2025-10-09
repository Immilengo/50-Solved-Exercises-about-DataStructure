import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class DijkstraBestLength {
    public static int bestlength(
        Map<String, Map<String,Integer>> graph,
        String start,
        String end
    ){
        Map<String,Integer> distance = new HashMap<>();
        Map<String,String> anterior = new HashMap<>();
        PriorityQueue<caminhoNo> fila = new PriorityQueue<>();
        
        for(String no : graph.keySet())
            distance.put(no, Integer.MAX_VALUE);
        
        distance.put(start, 0);
        anterior.put(start, null);
        fila.offer(new caminhoNo(start, 0));

        while (!fila.isEmpty()) {
            caminhoNo actual = fila.poll();
            String actualNo = actual.getNo();
            int actualDistancia = actual.getPeso();

            if(actualDistancia > distance.get(actualNo)) continue;
            if(actualNo.equals(end)) return actualDistancia;

            for(Map.Entry<String,Integer> vizinhoDoActual: graph.getOrDefault(actualNo, Collections.emptyMap()).entrySet()){
                String NoDovizinhoDoActual = vizinhoDoActual.getKey();
                int DistanciaDoVizinhoDoActual = vizinhoDoActual.getValue();

                int NovoCaminho = DistanciaDoVizinhoDoActual + actualDistancia;
                if (NovoCaminho < distance.getOrDefault(NoDovizinhoDoActual, Integer.MAX_VALUE)) {
                    distance.put(NoDovizinhoDoActual, NovoCaminho);
                    fila.offer(new caminhoNo(NoDovizinhoDoActual, NovoCaminho));
                    anterior.put(NoDovizinhoDoActual, actualNo);
                }
            }
        }

        return 0;
    }
    public static void main(String[] args){
        Map<String, Map<String,Integer>> grafo = new HashMap<>();
        grafo.computeIfAbsent("A", k -> new HashMap<>()).put("B", 5);
        grafo.computeIfAbsent("A", k -> new HashMap<>()).put("C", 3);
        grafo.computeIfAbsent("B", k -> new HashMap<>()).put("C", 1);
        grafo.computeIfAbsent("B", k -> new HashMap<>()).put("D", 4);
        grafo.computeIfAbsent("C", k ->  new HashMap<>()).put("E", 6);
        grafo.computeIfAbsent("D", k -> new HashMap<>()).put("E", 2);
        //Atribuido direções de retorno
        grafo.computeIfAbsent("B", k -> new HashMap<>()).put("A", 5);
        grafo.computeIfAbsent("C", k -> new HashMap<>()).put("A", 3);
        grafo.computeIfAbsent("C", k -> new HashMap<>()).put("B", 1);
        grafo.computeIfAbsent("D", k -> new HashMap<>()).put("B", 4);
        grafo.computeIfAbsent("E", k ->  new HashMap<>()).put("C", 6);
        grafo.computeIfAbsent("E", k -> new HashMap<>()).put("D", 2);
        System.out.println(bestlength(grafo, "A", "D"));
    }
}
