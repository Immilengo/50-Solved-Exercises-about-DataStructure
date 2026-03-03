import java.util.Map;
import java.util.HashMap;

public class mapa {
    public static void main(String[] args) {
       Map<Integer,String> mapa = new HashMap<>();
        mapa.put(1, "Inacio Milengo");
        System.out.println(mapa.getOrDefault(10, "Ninguem Registrado com este Id"));
    }
}
