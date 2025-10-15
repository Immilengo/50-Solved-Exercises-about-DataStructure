import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeetCode137_SingNumber2 {

    private static int SingleNumber(int[] nums){
        //Brute force - O(n²)
        
      /*for(int i = 0; i < nums.length; i++){
        int count = 1;
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] == nums[j])
                    count = count + 1;
            }
            if(count == 1)
                return nums[i];
        }*/

        //Light Weight Baby O(n)
        Map<Integer,Integer> frequencia = new HashMap<>();
        for(int n : nums)
            frequencia.put(n, frequencia.getOrDefault(n, 0) + 1);
        for(int par : frequencia.keySet())
            if(frequencia.get(par) == 1)
                return par;
        return 0;
    }
     private static int[] SingleNumber3(int[] nums){
        List<Integer> num = new ArrayList<>();
        Map<Integer,Integer> frequencia = new HashMap<>();
        for(int n : nums)
            frequencia.put(n, frequencia.getOrDefault(n, 0) + 1);
        for(int par : frequencia.keySet())
            if(frequencia.get(par) == 1)
                num.add(par);
        return new int[]{num.get(0),num.get(1)};
    }
    public static void main(String args[]){
        int[] num = {2,2,3,2};
        System.out.println(SingleNumber(num));
    }
}
