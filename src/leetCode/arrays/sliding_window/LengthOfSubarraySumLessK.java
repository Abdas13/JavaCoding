package leetCode.arrays.sliding_window;

public class LengthOfSubarraySumLessK {
    public static void main(String[] args) {
        /*
        Given an array of positive integers nums and an integer k,
        find the length of the longest subarray whose sum is
        less than or equal to k.
         */
        int[] nums = {3, 1, 2, 7, 4, 2, 1, 1, 5};
        System.out.println(findLength(nums,8));
    }
    public static int findLength(int[] nums, int k){
        int left = 0;
        int curr = 0; // the sum of window
        int ans = 0;
        for (int right = 0; right < nums.length; right++) {
            curr += nums[right];
            while (curr > k){
                curr -= nums[left];
                left++;
            }
            ans = Math.max(ans, right-left+1);
        }
        return ans;
    }
}
