package leetCode.arrays.prefix_sum;

import java.util.Arrays;

public class RunningSum {
    public static void main(String[] args) {
        /*
    Given an array nums. We define a running sum of an
    array as runningSum[i] = sum(nums[0]…nums[i]).

     Return the running sum of nums.
     Input: nums = [1,2,3,4]
     Output: [1,3,6,10]
     */
        int[] nums = {1,2,3,4,5};
        System.out.println(Arrays.toString(runningSum(nums)));
    }
    public static int[] runningSum(int[] nums){
        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];

        for (int i = 1; i <nums.length ; i++) {
            prefix[i] = prefix[i-1] + nums[i];
        }
        return prefix;
    }

}
