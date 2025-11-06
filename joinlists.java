import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class joinlists {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        List<Integer> lista = new ArrayList<>();
        for(int i = 0; i < m; i++)
            lista.add(nums1[i]);
        for(int i = 0; i< n; i++)
            lista.add(nums2[i]);
        Collections.sort(lista);
        System.out.println(lista);
    }
    public static void main(String[] args) {
        int[] n1={0};
        int[] n2={1};
        int n=1,m=0;
        merge(n1, m, n2, n);
    }
}
