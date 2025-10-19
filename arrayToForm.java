import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class arrayToForm{

    public List<String> removeAnagrams(String[] words) {
        Set<String> s = new HashSet<>();
        for(int i = 0; i < words.length; i++){
            char[] str = words[i].toCharArray();
            Arrays.sort(str);
            words[i] = new String(str);
            s.add(words[i]);
        }
       return s.stream().collect(Collectors.toList());
    }


    public List<Integer> addToArrayForm(int[] num, int k) {
        int n = Arrays.stream(num).reduce(0,(ac,m) -> ac*10 + m);
        n = n + k;
        int[] t = String.valueOf(n).chars().map(i -> i - '0').toArray();
        return 
        Arrays.stream(t).boxed().collect(Collectors.toList());
    }

}