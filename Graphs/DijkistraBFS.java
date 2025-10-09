import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

public class DijkistraBFS {
    public static List<String> findShortestDistance(
        Map<String, Map<String, Integer>> graph,
        String start,
        String end
    ) throws IOException
    {
        //Inicialindo as pricipais estruturas a serem usadas na nossa busca

        //Precisaremos de um Map para armazenar o no e o valor da sua aresta e iniciaremos com infinito, e indo sendo actualizado
        Map<String,Integer> distancias = new HashMap<>();
        //Este mapa vai conter uma coleção de nó e o seu predecessor
        Map<String, String> precedentes = new HashMap<>();
        //Uma fila q armazenará os elementos a serem processados por ordem de prioridade, por isso é tipo CaminhoNo q implementa Comparable
        PriorityQueue<caminhoNo> pq = new PriorityQueue<>();

        //precisamos inicializar todas as distâncias como infinito ou um número muito grande, para garantir q o início seja sempre menor
        for(String node : graph.keySet())
            distancias.put(node, Integer.MAX_VALUE);
        
        //inicializar as estruturas com os pontos de partida
        distancias.put(start, 0);
        precedentes.put(start, null);
        pq.offer(new caminhoNo(start, 0));

        //Laço para percorrer todos elementos da fila Prioritária(os elementos ainda nao visitados q representam o melhor caminho acumulado até o momento)
        while(!pq.isEmpty()){
            //Extrair o objecto actual da fila e seus elementos para trabalhar com eles
            caminhoNo current = pq.poll();
            String currentNo = current.getNo();
            int currentPeso = current.getPeso();

            //Verificar se a distancia actual é menor que o caminho na distancia do nó corente
            if(distancias.get(currentNo) < currentPeso) continue;

            //Verificar se o Nó corrente é igual ao Nó alvo: se sim -> chamar a função para reconstruir o caminho de  start até end(melhor caminho encontrado)
            if(currentNo.equals(end)) return reconstructPath(precedentes,end);

            //iterar pelo grafo para achar cada  mapa dentro do mapa, e o retorno será um entry set do formato Entry<String,Integer>
            for(Map.Entry<String,Integer> neigborEntry : graph.getOrDefault(currentNo, Collections.emptyMap()).entrySet()){
                String neighborNo = neigborEntry.getKey();
                int weigt = neigborEntry.getValue();

                //Calcular o  novo caminho somando o melhor caminho acumulado até aqui ao peso do visinho do actual
                int newcaminho = weigt + distancias.get(currentNo);
                //verificar se o melhor caminho acumulado até agora é realmente menor q o do visinho
                if(newcaminho < distancias.getOrDefault(neighborNo, Integer.MAX_VALUE)){
                    //Actualiza a fila com novo nô por visitar
                    distancias.put(neighborNo, newcaminho);
                    pq.add(new caminhoNo(neighborNo, newcaminho));
                    precedentes.put(neighborNo, currentNo);
                }
            }
        }
        return Collections.emptyList();
    }

    private static List<String> reconstructPath(Map<String,String> predecessor, String end){
        List<String> path = new ArrayList<>();
        String current = end;
        while (current != null) {
            path.add(0,current);
            current = predecessor.get(current);
        }
        return path;
    }
    
    public static void main(String[] augumetos) throws IOException{
        Map<String, Map<String,Integer>> grafo = new HashMap<>();
        grafo.put("A", Map.of("D",15));
        grafo.put("B", Map.of("C",2));
        grafo.put("D", Map.of("C",2));
        System.out.println(findShortestDistance(grafo, "A", "C"));
    }
}
