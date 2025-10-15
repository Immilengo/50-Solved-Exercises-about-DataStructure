import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.stream.*;

public class QueuePriorityQueueDiff{

    public static void main(String[] args) {
        Queue<String> fila= new LinkedList<>();
        PriorityQueue<String> filaPrioridade = new PriorityQueue<>(Collections.reverseOrder());

        fila.offer("Imm");
        fila.offer("3");
        fila.offer("1");
        fila.offer("2");
        fila.offer("9");
        for(String n : fila)
            System.out.println("Fila Normal: " + n);

        filaPrioridade.offer("imm");
        filaPrioridade.offer("1");
        filaPrioridade.offer("3");
        filaPrioridade.offer("2");
        filaPrioridade.offer("Ania");
        for(String n : filaPrioridade)
            System.out.println("Fila Prioridade: " + n);
    }
}