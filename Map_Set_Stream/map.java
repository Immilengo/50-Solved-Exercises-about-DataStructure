package Map_Set_Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public abstract class map {
        // Dado um array de strings, conte a frequência de cada palavra
        public Map<String, Integer> countWords(String[] words) {
            // Implemente usando Map
            Map<String,Integer> freqMap=new HashMap<>();
            for (String string : words) 
                freqMap.put(string, freqMap.getOrDefault(freqMap,0)+1);
            return freqMap;
        }

        // Verifique se duas strings são anagramas
        public boolean isAnagram(String s, String t) {
            // Implemente usando Map para contar caracteres 
            Map<Character,Integer> anagrama1=new HashMap<>();
            Map<Character,Integer> anagrama2=new HashMap<>();
            char[] sStr=s.toCharArray();
            char[] tStr=t.toCharArray();
            for (char c1 : sStr)
                anagrama1.put(c1,anagrama1.getOrDefault(c1,0)+1);
            for(char c2 : tStr)
                anagrama2.put(c2, anagrama2.getOrDefault(c2, 0)+1);
                        
            return  anagrama1.equals(anagrama2);
        }

        // Conte a frequência de cada caractere em uma string
        public Map<Character, Integer> countCharacters(String str) {
            // Implemente usando Map
            Map<Character,Integer> countCharMap=new HashMap<>();
            char[] charStr = str.toCharArray();
            for(char c : charStr)
                countCharMap.put(c,countCharMap.getOrDefault(c, 0)+1);
            return Map.of();//Collections.max(countCharMap.entrySet().stream().sorted(Comparator.naturalOrder()));
        }

        // Encontre os K elementos mais frequentes
        public static class chave_valor implements Comparable{
            int chave;
            int valor;

            @Override
            public int compareTo(Object arg) {
                return Math.max(valor, chave);
            }
        }
        public static List<Integer> topKFrequent(int[] nums, int k) {
            // Use Map para frequência e Stream para ordenar
            Map<Integer,Integer> frequency = new HashMap<>();
            Set<Integer> chave = new HashSet<>();
            Set<chave_valor> valores = new HashSet<>();
            PriorityQueue<chave_valor> priority = new PriorityQueue<>(Comparator.reverseOrder());

            for (int iterable_element : nums)
                frequency.merge(iterable_element, 1, Integer::sum);
            for(Map.Entry<Integer,Integer> i : frequency.entrySet()){
                chave_valor tal = new chave_valor();
                tal.chave = i.getKey();
                tal.valor = i.getValue();
                valores.add(tal);
            }
           /*frequency.forEach((key,v) -> {
                System.out.println(key + " "+ v);
            });
            for(Map.Entry<Integer,Integer> hub : frequency.entrySet())
                System.out.println(hub.getKey() +" "+ hub.getValue()); */
           return frequency.entrySet()
                           .stream()
                           .sorted()
                           .limit(k)
                           .map(Map.Entry::getKey)
                           .collect(Collectors.toList());
        }

        // Agrupe todas as strings que são anagramas entre si
        public List<List<String>> groupAnagrams(String[] strs) {
            // Use Map com chave sendo string ordenada
            return null;
        }

        // Encontre todos os números que aparecem pelo menos 2 vezes
        public static List<Integer> findDuplicates(int[] nums) {
            Map<Integer,Integer> twice = new HashMap<>();
            Set<Integer> duplo = new HashSet<>();
            Set<Integer> duplo2 = new HashSet<>();
            List<Integer> ret = new ArrayList<>();

            for(int i : nums)
                twice.merge(i,1,Integer::sum);
            for(int i : nums)
                if(!duplo.add(i))
                    duplo2.add(i);
            // Use Map ou Set
            return duplo2.stream().toList();
        }

        // Conte quantas palavras únicas existem ignorando case
        public int countUniqueWords(List<String> words) {
            // Use Stream e map String::toLowerCase
            return 0;
        }

        // Encontre o elemento que mais aparece em um array
        public int mostFrequentElement(int[] nums) {
            // Use Map e Stream max
            Map<Integer,Integer> maxi = new HashMap<>();
            for(int i : nums)
                maxi.merge(i, 1, Integer::sum);
            return 0;
        }

        // Conte quantos subarrays somam exatamente K
        public int subarraySum(int[] nums, int k) {
            // Use Map com prefix sum
            return 0;
        }

        // Encontre o tamanho da maior substring sem caracteres repetidos
        public int longestUniqueSubstring(String s) {
            // Use Set ou Map com sliding window
            return 0;
        }

        // Dado array de scores, retorne array com ranking (1° maior score, etc)
        public int[] findRanks(int[] scores) {
            //Use Stream com sorting e Map para mapear score->rank
            return new int[]{};
        }

        // Agrupe pessoas por cidade e depois por faixa etária
        public Map<String, Map<String, List<Integer>>> groupByCityAndAgeGroup(List<Integer> people) {
            // Use groupingBy aninhado
            return Map.of();
        }

        // Encontre o primeiro caractere não repetido em uma string
        public char firstNonRepeatingChar(String s) {
            // Implemente usando LinkedHashMap para manter ordem
            return 0;
        }

        public static void main(String[] args) {
            int[] n = {1,2,5,8,2,2,2,4,5,4,4,3,2,2,1,1,2,1,3,8,9,7,6,4,2,51,6,1,3,5,51,23,4};
            System.out.println(findDuplicates(n));
        }
}
