package practice;

import java.util.Arrays;

public class LargestNumbersInArray {
    public static void main(String[] args) {
        int[] nums={3,6,7,14,45,34,5,7,3,2};
        largestNums(nums);

    }
    public static int largestNums(int[] nums){

//        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j <nums.length ; j++) {
                int temp;
                if (nums[i]>nums[j]){
                    temp=nums[j];
                    nums[j]=nums[i];
                    nums[i]=temp;
                }
            }
        }
        System.out.println("The largest is: "+nums[nums.length-1]+ " and the second largest is: "+nums[nums.length-2]);
        return nums[0];
    }
}
