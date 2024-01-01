package leetCode.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};

//        System.out.println(majorityElement(nums));
        System.out.println(majorElmnt(nums));
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
    public static int majorElmnt(int[] nums){
        int left = 1, count = 1;
        Arrays.sort(nums);

        for (int right = 1; right < nums.length ; right++) {
            if (nums[right]==nums[right-1]){
                count++;
                if(count>nums.length/2)
                    return nums[right];
            }else {
                count=1;
            }
        }
        return -1;
    }
    public static int findMajorElement(int[] nums){
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
