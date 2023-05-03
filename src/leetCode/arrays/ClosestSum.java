package leetCode.arrays;

import java.util.Arrays;

public class ClosestSum {
    public static void main(String[] args) {
        //Input: nums = [-1,2,1,-4], target = 1
        //Output: 2
        //Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
        int[] nums={-1,2,1,-4};
        int[] numbers={-5,-5,-4,0,0,3,3,4,5};
        System.out.println(threeSumClosest(nums,2));
        System.out.println(threeSumClosest(numbers,-2));
    }
    public static int threeSumClosest(int[] nums, int target){
//        Arrays.sort(nums);
        int sum=0;
        int minDistance=Integer.MAX_VALUE;
        int result=0;
        for (int i = 0; i < nums.length-2; i++) {
            for (int left = i+1; left <nums.length ; left++) {
            int right=nums.length-1;
            while (left<right){
                sum=nums[i]+nums[left]+nums[right--];
                //minDistance= Math.min((minDistance), Math.abs(sum-target));
                if(minDistance>Math.abs(sum-target)){
                    minDistance=Math.abs(sum-target);
                    result=sum;
                }
            }}
        }
        return result;
    }
}
