package collections.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueNumberOccurances {
    public static void main(String[] args) {
        int[] nums = {-3,0,1,-3,1,1,1,-3,10,0};

        Map<Integer, Integer> hmap = new HashMap<>();

        for (Integer num:nums) {
            hmap.put(num,hmap.getOrDefault(num,0)+1);
        }
        Set<Integer> hset = new HashSet<>(hmap.values());

        System.out.println(hmap.size()== hset.size());
    }
}
