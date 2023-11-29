package leetCode.arrays.sliding_window;

public class BestSubarraySum {
    /*
    Given an integer array nums and an integer k,
    find the sum of the subarray with the largest sum whose length is k.
     */
    public static void main(String[] args) {
        int[] nums = {3, -1, 4, 12, -8, 5, 6};
        int k = 4;
        System.out.println(findBestSubarray(nums, k));

    }
    public static int findBestSubarray(int[] nums, int k){

        int sum = 0;
        int ans = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        ans = sum;
        for (int i = k; i < nums.length ; i++) {
            sum += nums[i] - nums[i-k];
            ans = Math.max(ans, sum);
        }
        return ans;
    }
}
