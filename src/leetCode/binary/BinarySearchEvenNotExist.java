package leetCode.binary;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class BinarySearchEvenNotExist {
    public static void main(String[] args) {
        int[] nums={1,3,5,7,10};
        int target = 5;
        System.out.println(findIndex(nums,target));
    }
    public static int findIndex(int[] nums, int target){
//        int left=0;
//        int right= nums.length-1;
//        int mid = 0;
//        while(left<right) {
//            mid = (left + right) / 2;
//            if(nums[mid]==target)
//                return mid;
//            if(target>nums[mid]) {
//                left = mid + 1;
//            }
//            else{
//                right = mid-1;
//            }
//        }
//        return right+1;
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            if(target>nums[i])
                count++;
        }
        return count;

    }


}
