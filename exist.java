import java.util.HashMap;
import java.util.Map;

public class exist {
    public boolean exist(char[][] board, String word) {
        Map<Character,Integer> mapa = new HashMap<>();
        Map<Character,Integer> mapa2 = new HashMap<>();

        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                char c = board[i][j];
                mapa.put(board[i][j],mapa.getOrDefault(c,0) + 1);
            }
        }
        for(int i = 0; i < word.length(); i++)
            mapa2.put(word.charAt(i), mapa2.getOrDefault(word.charAt(i)+1,0));
        char[] t = word.toCharArray();
        for(char c : t)
            if(!mapa.containsKey(c))
                return false;
            else
                if(mapa.get(c) != mapa2.get(c)) return false;
        return true;
    }
}
