package arrays;

import java.util.Arrays;

public class ArrangeJustOdds {
    public static void main(String[] args) {

        int[] nums = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        System.out.println(Arrays.toString(arrangeOdds(nums)));
        System.out.println(Arrays.toString(sortOdds(nums)));
    }
    public static int[] arrangeOdds(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] % 2 == 0 || nums[j] % 2 == 0) {
                }
                else if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums;
    }
    public static int[] sortOdds(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int left = 0;
            int right;
            if (nums[nums.length - 1] % 2 != 0) {
                right = nums.length - 1;
            } else {
                right = nums.length - 2;
            }
            while (nums[left] > nums[right]) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }
        }
        return nums;
    }
}

