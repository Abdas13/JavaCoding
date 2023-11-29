package leetCode.arrays.prefix_sum;

import java.util.ArrayList;
import java.util.Arrays;

public class MinValueToGetPositive {
    public static void main(String[] args) {
        /*
        Given an array of integers nums,
        you start with an initial positive value startValue.

        In each iteration, you calculate the step by step sum
        of startValue plus elements in nums (from left to right).

        Return the minimum positive value of startValue such that
        the step by step sum is never less than 1.
        Input: nums = [-3,2,-3,4,2]
           Output: 5  ([2,4,1,5,7])
         */
        int[] nums = {-3,2,-3,4,2};
        System.out.println(minStartValue(nums));

    }
    public static int minStartValue(int[] nums){

        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i-1];
            min = Math.min(min, nums[i]);
        }
        return min<0 ? 1-min : 1;
    }
}
