package leetCode.arrays.prefix_sum;

public class SplitArrayOptions {
    public static void main(String[] args) {
        /*
        2270. Number of Ways to Split Array
         Given an integer array nums, find the number of ways to split
         the array into two parts so that the first section has a sum
         greater than or equal to the sum of the second section.
         The second section should have at least one number.
         */
        int[] nums = {10,4,-8,7};
        System.out.println(waysToSplitArray(nums));
        System.out.println(waysToSplitArrayWithoutArray(nums));
    }
    public static int waysToSplitArray(int[] nums){

        long[] prefix = new long[nums.length];
        prefix[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i-1] + nums[i];
        }
        int ans = 0;
        for (int i = 0; i < nums.length-1; i++) {
            long leftSection = prefix[i];
            long rightSection = prefix[nums.length-1]-prefix[i];
            if (leftSection>=rightSection) ans++;
        }
        return ans;
    }
    public static int waysToSplitArrayWithoutArray(int[] nums){
        int ans = 0;
        long leftSection = 0;
        long total = 0;

        for(int each: nums){
            total += each;
        }
        for (int i = 0; i < nums.length-1; i++) {
            leftSection += nums[i];
            long rightSection = total - leftSection;
            if (leftSection>=rightSection) ans++;
        }
        return ans;
    }

}
