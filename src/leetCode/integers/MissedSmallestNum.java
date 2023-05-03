package leetCode.integers;

import java.util.Arrays;

public class MissedSmallestNum {
    public static void main(String[] args) {
        //Given an unsorted integer array nums, find the smallest missing positive integer.
        int[] nums = {3, 4, -1, 2};
        System.out.println(smalledMissedPos(nums));
        //output=2
    }
    public static int smalledMissedPos(int[] nums) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] ==1) {
                continue;
            }
            else if(nums[i]>0 && (nums[i] != nums[i-1]+1)){
                return nums[i-1]+1;
            }
        }
        return 1;
    }
}

