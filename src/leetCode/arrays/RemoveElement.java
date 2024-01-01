package leetCode.arrays;

import java.util.Arrays;

public class RemoveElement {
    /* Given an integer array nums and an integer val, remove all occurrences
    of val in nums in-place. The order of the elements may be changed.
    Then return the number of elements in nums which are not equal to val

    Ex:
    input :
     */
    public static void main(String[] args) {
        int[] nums = {3,2,2,2,2,3};
        int val = 3;
//        System.out.println(removeElement(nums,val));
        System.out.println(removeEl(nums, val));
    }
    public static int removeElement(int[] nums, int value){
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            if(nums[right]!=value){
                nums[left]=nums[right];
                left++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return left;
    }
    public static int removeEl(int[] nums, int value){
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=value)
                count++;
        }
        System.out.println(Arrays.toString(nums));
        return count;
    }
}
