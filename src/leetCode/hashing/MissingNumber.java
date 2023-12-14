package leetCode.hashing;

public class MissingNumber {
    public static void main(String[] args) {
        /*
        Given an array nums containing n distinct numbers in the range [0, n],
        return the only number in the range that is missing from the array.
         Input: nums = [3,0,1]
          Output: 2
         */

    }
    public static int missedNumber(int[] nums){
        int expectedSum = nums.length * (nums.length+1)/2;
        int actualSum = 0;
        for (int i = 0; i < nums.length; i++) {
            actualSum += nums[i];
        }
        return expectedSum-actualSum;
    }
}
