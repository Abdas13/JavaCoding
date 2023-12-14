package leetCode.arrays.prefix_sum;

import java.util.Arrays;

public class FindLargestAltitude {
    public static void main(String[] args) {
        /*
        There is a biker going on a road trip. The road trip consists of n + 1 points at different altitudes.
        The biker starts his trip on point 0 with altitude equal 0.
       You are given an integer array gain of length n where gain[i] is the net gain in altitude between
        points i and i + 1 for all (0 <= i < n). Return the highest altitude of a point.
Example 1:
        Input: gain = [-5,1,5,0,-7]
       Output: 1
       Explanation: The altitudes are [0,-5,-4,1,1,-6]. The highest is 1.
         */
        int[] nums = {-5,1,8,0,-7};
        System.out.println(highestAltitude(nums));
    }
    public static int highestAltitude(int[] nums){
        int[] prefixSum = new int[nums.length+1];
        prefixSum[0]=0;
        int ans = 0;
        for (int i = 1; i < nums.length+1; i++) {
            prefixSum[i] = prefixSum[i-1] +nums[i-1];
            ans = Math.max(ans, prefixSum[i]);
        }
        System.out.println(Arrays.toString(prefixSum));
        return ans;
    }
}
