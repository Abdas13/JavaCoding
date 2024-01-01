package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SumClosestZero {
    /*
    return the sum of the two elements closest to zero
    If there are two elements equally close to zero like -2 and 2,
    consider the positive element to be "closer" to zero than the negative one.
     */
    public static void main(String[] args) {

        int[] nums = {-4,-3,-1,0,2,6,7,2,-8};
        int[] nums2 = {1,-3,5,-2,4,6};
        System.out.println(sumToZero(nums));
        System.out.println(sumToZero(nums2));

    }
    public static int sumToZero(int[] nums){

        Arrays.sort(nums);
        int target = Integer.MAX_VALUE;
        int left = 0;
        int right = nums.length-1;

        while(left<right){
            target = nums[left] + nums[right];
            if (target>0) right--;
            else if (target<0) left++;
            else return target;
        }
        return target;
    }
}
