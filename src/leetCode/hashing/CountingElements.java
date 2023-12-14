package leetCode.hashing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CountingElements {
    public static void main(String[] args) {
/*
Given an integer array arr, count how many elements x there are, such that x + 1
is also in arr. If there are duplicates in arr, count them separately.
*/
        int[] nums = {2,5,3,1,0};
        System.out.println(countElements(nums));

    }
    public static int countElements(int[] nums){
//        int count=0;
//        for(int i=0; i<nums.length;i++){
//            if(Arrays.binarySearch(nums, nums[i]+1)>=0) count++;  // ?
//        }
//        return count;
        Set<Integer> hs = new HashSet<>();
        for(int num:nums){
            if(!hs.contains(num))
                hs.add(num);
        }
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            if(hs.contains(nums[i]+1))
                count++;
        }
        return count;

    }
}
