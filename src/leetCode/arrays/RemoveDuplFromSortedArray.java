package leetCode.arrays;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplFromSortedArray {

    public static void main(String[] args) {

        int[] nums={0,0,1,1,1,2,2,3,3,4};

        System.out.println(removeDuplicates(nums));
    }
    public static int removeDuplicates(int[] nums){

        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right]!=nums[left]){
                left++;
                nums[left]=nums[right];
            }
        }
        return  left+1;
    }
}
