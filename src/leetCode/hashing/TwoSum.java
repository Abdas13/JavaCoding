package leetCode.hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        /*
        Two Sum
Given an array of integers nums and an integer target,
return indices of two numbers such that they add up to target.
You cannot use the same index twice.
         */
        int[] nums = {5,2,7,10,3,9};
        int target = 8;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
    public static int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if(hm.containsKey(complement)){
                return new int[] {i, hm.get(complement)};
            }else {
                hm.put(nums[i],i);
            }
        }
        return new int[]{-1,-1};
    }
}
