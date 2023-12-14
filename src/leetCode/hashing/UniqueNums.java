package leetCode.hashing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueNums {
    public static void main(String[] args) {
        /*
        Given an integer array nums, find all the unique numbers x in nums
        that satisfy the following: x + 1 is not in nums, and x - 1 is not in nums.
         */

    }
    public static List<Integer> findNumbers(int[] nums){
        List<Integer> ans = new ArrayList<>();
        Set<Integer> hs = new HashSet<>();
        for (int num:nums) {
            hs.add(num);
        }
        for (int num:nums) {
            if(!hs.contains(num+1) && !hs.contains(num-1) )
                ans.add(num);
        }
        return ans;
    }
}
