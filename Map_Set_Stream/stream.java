package Map_Set_Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class stream {

        // Calcule a soma de todos os números pares de uma lista
        public int sumEvenNumbers(List<Integer> numbers) {
            // Implemente usando Stream
            return numbers.stream()
                    .filter(n -> n % 2 == 0)
                    .mapToInt(i -> i)
                    .sum();
        }

        // Filtre strings com mais de 3 caracteres e ordene alfabeticamente
        public List<String> filterAndSort(List<String> strings) {
            // Implemente usando Stream
            return strings.stream()
                    .filter(n -> n.length() > 3)
                    .sorted()
                    .toList();
        }

        // Agrupe palavras por seu tamanho
        public Map<Integer, List<String>> groupByLength(List<String> words) {
            // Implemente usando Stream e Collectors.groupingBy
            return null;
        }

        // Encontre o maior número em uma lista usando Stream
        public int findMax(List<Integer> numbers) {
            // Implemente usando Stream
            return numbers.stream()
                    .max(null)
                    .orElseThrow(null);
        }

        // Encontre os K elementos mais frequentes
        public List<Integer> topKFrequent(int[] nums, int k) {
            // Use Map para frequência e Stream para ordenar
            return null;
        }

        // Conte quantas palavras únicas existem ignorando case
        public int countUniqueWords(List<String> words) {
            // Use Stream e map String::toLowerCase
            return 0;
        }

        // Calcule a média dos números positivos em uma lista
        public double averagePositiveNumbers(List<Integer> numbers) {
            // Implemente usando Stream
            return numbers.stream()
                    .filter(n -> n > 0)
                    .mapToDouble(i -> i)
                    .average()
                    .getAsDouble();
        }

        // Encontre a string mais longa em uma lista
        public String longestString(List<String> strings) {
            // Use Stream com max e Comparator
            return null;
        }

        // Filtre pessoas com idade > 18 e converta para map nome->idade
        public Map<String, Integer> adultsMap(List<Person> people) {
            // Implemente usando Stream
            return null;
        }

        // Calcule sum, max, min e average de uma lista de inteiros
        public void calculateStats(List<Integer> numbers) {
            // Use Collectors.summarizingInt
        }

        // Ordene strings por length e depois alfabeticamente
        public List<String> customSort(List<String> strings) {
            // Use Stream com Comparator
            return null;
        }

        // Converta lista de strings para uppercase e remova vazias
        public List<String> processStrings(List<String> strings) {
            // Use Stream map e filter
            return null;
        }

        // Encontre o elemento que mais aparece em um array
        public int mostFrequentElement(int[] nums) {
            // Use Map e Stream max
            return 0;
        }

        // Dado array de scores, retorne array com ranking (1° maior score, etc)
        public int[] findRanks(int[] scores) {
            // Use Stream com sorting e Map para mapear score->rank
            return Arrays.stream(scores).sorted().map(score -> score).toArray();
        }

        // Dada lista de transações, calcule total por categoria
        public Map<String, Double> totalByCategory(List<Transaction> transactions) {
            // Use Stream e Collectors.groupingBy com summingDouble
            return null;
        }
}