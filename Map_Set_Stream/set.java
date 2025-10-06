package Map_Set_Stream;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class set {
        // Remova elementos duplicados de uma lista mantendo a ordem
        public List<Integer> removeDuplicates(List<Integer> list) {
            // Implemente usando Set
            Set<Integer> listaSet=new LinkedHashSet<>();
            for (Integer e : list)
                listaSet.add(e);
            return listaSet.stream()
                           .toList();
        }

        // Encontre a interseção de dois arrays
        public int[] intersection(int[] nums1, int[] nums2) {
            // Implemente usando Set
            Set<Integer> set1=new HashSet<>();
            Set<Integer> resultado=new HashSet<>();
            for (Integer integer : resultado)
                set1.add(integer);
            for (Integer integer : resultado) {
                if (!set1.add(integer))
                    resultado.add(integer);
            }
            return resultado.stream()
                            .mapToInt(i -> i)
                            .toArray();
        }

        // Faça a união de dois conjuntos
        public Set<Integer> union(Set<Integer> set1, Set<Integer> set2) {
            // Implemente usando Set
            Set<Integer> resultSet= new HashSet<>();
            for(int s : set1)
                resultSet.add(s);
            for(int s : set2)
                resultSet.add(s);

            return resultSet;
        }

        // Verifique se existem dois números que somam target
        public boolean twoSum(int[] nums, int target) {
            // Implemente usando Set
            return false;
        }

        // Encontre todos os números que aparecem pelo menos 2 vezes
        public List<Integer> findDuplicates(int[] nums) {
            // Use Map ou Set
            return null;
        }

        // Encontre elementos que estão em set1 mas não em set2
        public Set<Integer> difference(Set<Integer> set1, Set<Integer> set2) {
            // Use Set operations
            Set<Integer> difSet=new HashSet<>();
            for (Integer integer : set1) {
                if(!set2.contains(integer))
                    difSet.add(integer);
            }
            return difSet;
        }

        // Encontre o tamanho da maior substring sem caracteres repetidos
        public int longestUniqueSubstring(String s) {
            // Use Set ou Map com sliding window
            return 0;
        }


}
