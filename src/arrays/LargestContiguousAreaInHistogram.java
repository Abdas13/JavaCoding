package arrays;

import java.util.HashMap;
import java.util.Map;

public class LargestContiguousAreaInHistogram {
    public static void main(String[] args) {
        int[] bars =  {6, 2, 5, 4, 5, 1, 6};
        System.out.println(largestAreaSum(bars));

        int[] bars2 = {1,2,4,6,7,7,6,8,7,5};
        System.out.println(largestAreaSum(bars2));
    }
    public static int largestAreaSum(int[] bars){
        Map<Integer, Integer> hm = new HashMap<>();
        for (int b : bars){
            hm.put(b, hm.getOrDefault(b,0)+1);
        }
        int ans = 0;
        for(Map.Entry<Integer, Integer> entry : hm.entrySet()){
            ans = Math.max(ans, entry.getValue()* entry.getKey());
        }
        return ans;
    }
}
