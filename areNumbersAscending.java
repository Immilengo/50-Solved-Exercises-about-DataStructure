public class areNumbersAscending {
     public static boolean areNumbersAscending(String s) {
       int prev = -1;
       int num;

       String[] words = s.split(" ");
       for(String word : words){
            if(word.chars().allMatch(Character::isDigit)){
                num = Integer.parseInt(word);
                if(num <= prev) return false;
                prev = num;
            }
       }
       return true;
       /*    int prev = -1;
        String[] parts = s.split(" ");

        for (String word : parts) {
            if (word.chars().allMatch(Character::isDigit)) {
                int num = Integer.parseInt(word);
                if (num <= prev) return false;
                prev = num;
            }
        }
        return true; */
    }
    public static void main(String[] args) {
        System.out.println(areNumbersAscending("1 box has 3 blue 4 red 6 green and 12 yellow marbles"));
    }
}
