import java.util.Set;

public class sets {
    public static void main(String[] args) {
        Set<Integer> conjunto = Set.of(1,2,3,4,5,6,32);
        conjunto.stream().forEach(n -> System.out.println(
            "Este número está no conjunto: " + n
        ));
        System.out.println(conjunto);
    }
}
