package leetCode.arrays.sliding_window;

public class SubProductLessThanK {
    /*
     713. Subarray Product Less Than K.

Given an array of positive integers nums and an integer k, return the number of subarrays where the product of all the elements in the subarray is strictly less than k.

For example, given the input nums = [10, 5, 2, 6], k = 100, the answer is 8. The subarrays with products less than k are:

[10], [5], [2], [6], [10, 5], [5, 2], [2, 6], [5, 2, 6]
     */
    public static void main(String[] args) {

        int[] nums = {10, 5, 2, 6};
        int k = 100;
        System.out.println(numSubarrayProductLessThanK(nums, k));
    }
    public static int numSubarrayProductLessThanK(int[] nums, int k){

        if (k<=1) return 0;
        int left = 0;
        int ans = 0;
        int curr = 1;
        for (int right = 0; right < nums.length; right++) {
            curr *= nums[right];
            while (curr>=k){
                curr /= nums[left];
                left++;
            }
            ans += right-left+1;
        }
        return ans;
    }
}
