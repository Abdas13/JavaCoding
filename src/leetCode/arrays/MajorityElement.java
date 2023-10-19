package leetCode.arrays;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};

        System.out.println(majorityElement(nums));
    }
    public static int majorityElement(int[] nums){
        Map<Integer, Integer> hmap = new HashMap<>();
        for (int num:nums) {
            hmap.put(num, hmap.getOrDefault(num, 0)+1);
        }
        for (Map.Entry<Integer,Integer> entry : hmap.entrySet()) {
            if (entry.getValue()>nums.length/2)
                return entry.getKey();
        }
        return -1;
    }
}
