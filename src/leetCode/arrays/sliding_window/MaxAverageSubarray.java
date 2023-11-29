package leetCode.arrays.sliding_window;

public class MaxAverageSubarray {
    /*
    You are given an integer array nums consisting of n elements,
    and an integer k.
    Find a contiguous subarray whose length is equal to k that
    has the maximum average value and return this value.
     */
    public static void main(String[] args) {
        int[] nums = {1,12,-5,-6,50,3};
        int k = 4;
        System.out.println(findMaxAverage(nums, k));
    }
    public static double findMaxAverage(int[] nums, int k){
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
        return (double) ans/k;
    }
}
