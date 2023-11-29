package leetCode.arrays;

import java.util.Arrays;

public class SquareOfSortedArrays {
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};

        System.out.println(Arrays.toString(sortedSquares(nums)));
    }
    public static int[] sortedSquares(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int)Math.pow(nums[i],2);
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length-1; j++) {
                if (nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
        return nums;
    }
}
