import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class DFS {
    public static void Depth_first_search(
        int u,
        ArrayList<ArrayList<Integer>> grafo,
        int size
    ){
        if(grafo.isEmpty()){
            System.out.println("Graph is empty");
            return;
        }
        Deque<Integer> stack= new ArrayDeque<>();
        boolean[] visited = new boolean[size];

        stack.push(u);
        visited[u] = true;

        System.out.println("A ordem da busca é a seguinte: ");
        while (!stack.isEmpty()) {
            int actual = stack.pop();

            System.out.println("A aresta actual é: "+ actual);

            for(int v : grafo.get(actual)){
                if(!visited[v]){
                    visited[v] = true;
                    stack.push(v);
                }
            }
        }
    }
    public static void main(String[] args) {
          int size = 5;

        ArrayList<ArrayList<Integer>> grafo = new ArrayList<>();

        // Inicializando as listas internas, temos que prestar atenção nesse ponto gafanhoto
        for (int i = 0; i < size; i++)
            grafo.add(new ArrayList<>());

        grafo.get(0).add(1);
        grafo.get(0).add(2);

        grafo.get(1).add(0);
        grafo.get(1).add(2);
        grafo.get(1).add(3);

        grafo.get(2).add(0);
        grafo.get(2).add(1);
        grafo.get(2).add(3);

        grafo.get(3).add(1);
        grafo.get(3).add(2);
        grafo.get(3).add(4);

        grafo.get(4).add(3);

        // Chama DFS a partir do vértice 0
        Depth_first_search(0, grafo, size);
    }
}
