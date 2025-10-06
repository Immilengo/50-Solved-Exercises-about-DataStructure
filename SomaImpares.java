import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class SomaImpares {
    public static void main(String[] args) throws IOException{
        PrintWriter out=new PrintWriter(System.out);
        Map<Integer,String> mapa= new HashMap<>();
        mapa.put(1, "Inácio");
        mapa.put(2, "Mazanga");
        mapa.put(3, "Milengo");
        out.println(mapa.size());
        out.println(mapa.get(3));
        out.flush();
    }
}
