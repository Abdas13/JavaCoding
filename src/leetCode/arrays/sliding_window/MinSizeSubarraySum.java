package leetCode.arrays.sliding_window;

public class MinSizeSubarraySum {
    public static void main(String[] args) {
        /*
        Given an array of positive integers nums and a positive integer target,
        return the minimal length of a subarray whose sum is greater than or equal
         to target. If there is no such subarray, return 0 instead.
         Input: target = 7, nums = [2,3,1,2,4,3]
         Output: 2
         Explanation: The subarray [4,3] has the minimal length under the problem constraint.
         */
        int target = 8;
        int[] nums = {2,3,1,2,4,3};
        System.out.println(minSubArrayLen(target, nums));
    }
    public static int minSubArrayLen(int target, int[] nums) {

        int left = 0;
        int curr = 0;
        int ans = Integer.MAX_VALUE;
        for (int right = 0; right < nums.length; right++) {
            curr += nums[right];
            while(curr>=target){
                ans = Math.min(ans, right-left +1);
                curr -=nums[left];
                left++;
            }
        }
        int sum=0;
        for(int i=0; i< nums.length;i++){
            sum+=nums[i];
        }
        if(sum<target) return 0;
        return ans;

    }
}
