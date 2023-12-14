package leetCode.arrays.prefix_sum;

public class PivotIndex {
    public static void main(String[] args) {
        /*
        Given an array of integers nums, calculate the pivot index of this array.
The pivot index is the index where the sum of all the numbers strictly to the left
of the index is equal to the sum of all the numbers strictly to the index's right.
If the index is on the left edge of the array, then the left sum is 0 because there
are no elements to the left. This also applies to the right edge of the array.
Return the leftmost pivot index. If no such index exists, return -1.
Input: nums = [1,7,3,6,5,6]
Output: 3
Explanation:
The pivot index is 3.
Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
Right sum = nums[4] + nums[5] = 5 + 6 = 11
         */


        int[] nums = {1,7,3,6,5,6};
        System.out.println(findPivotIndex(nums));
    }
    public static int findPivotIndex(int[] nums){
        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i-1] + nums[i];
        }
        int leftSection =0;
        for (int i = 0; i < nums.length; i++) {
            leftSection += nums[i];
            int rightSection = prefix[prefix.length-1] - leftSection - nums[i+1];
            if(leftSection==rightSection){
                return nums[i+1];
            }
        }
        return -1;
    }
}
