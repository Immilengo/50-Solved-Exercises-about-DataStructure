package Map_Set_Stream;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
            return Collections.max(countCharMap.entrySet().stream().sorted(Comparator.naturalOrder()));
        }

        // Encontre os K elementos mais frequentes
        public List<Integer> topKFrequent(int[] nums, int k) {
            // Use Map para frequência e Stream para ordenar
            return null;
        }

        // Agrupe todas as strings que são anagramas entre si
        public List<List<String>> groupAnagrams(String[] strs) {
            // Use Map com chave sendo string ordenada
            return null;
        }

        // Encontre todos os números que aparecem pelo menos 2 vezes
        public List<Integer> findDuplicates(int[] nums) {
            // Use Map ou Set
            return null;
        }

        // Conte quantas palavras únicas existem ignorando case
        public int countUniqueWords(List<String> words) {
            // Use Stream e map String::toLowerCase
            return 0;
        }

        // Encontre o elemento que mais aparece em um array
        public int mostFrequentElement(int[] nums) {
            // Use Map e Stream max
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
            // Use Stream com sorting e Map para mapear score->rank
            return new int[]{};
        }

        // Agrupe pessoas por cidade e depois por faixa etária
        public Map<String, Map<String, List<Person>>> groupByCityAndAgeGroup(List<Person> people) {
            // Use groupingBy aninhado
            return null;
        }

        // Encontre o primeiro caractere não repetido em uma string
        public char firstNonRepeatingChar(String s) {
            // Implemente usando LinkedHashMap para manter ordem
            return 0;
        }
}
