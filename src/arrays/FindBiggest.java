package arrays;

import java.util.Arrays;

public class FindBiggest {
    public static void main(String[] args) {
        int [] myArray = {-10, -3, -20, 6};

        System.out.println(findMax(myArray));
        System.out.println(findBiggest(myArray));
    }
    public static int findMax(int[] nums){
        Arrays.sort(nums);
        return nums[nums.length-1];
    }
    public static int findBiggest(int[] nums){
        int biggest=Integer.MIN_VALUE;
        for (int num : nums) {
            biggest = Math.max(biggest, num);
        }
        return biggest;
    }
}
