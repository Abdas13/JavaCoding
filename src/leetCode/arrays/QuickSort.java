package leetCode.arrays;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {

        int[] nums = {3,8,7,9,5,4,2,5};
        System.out.println(Arrays.toString(quickSort(nums, 0, 7)));

    }
    public static int[] quickSort(int[] nums, int left, int right){

        if (left<right){
            int pi=partition(nums, left, right);
            quickSort(nums, left, pi-1);
            quickSort(nums, pi+1, right);
        }
        return nums;
    }

    public static int partition(int[] nums, int left, int right) {

        int i = left - 1;
        int pivot = nums[right];
        for (int j = left; j < right; j++) {
            if (pivot> nums[j]){
                i++;
                swap(nums, i, j);
            }
        }
        swap(nums, i+1, right);
        return i+1;
    }

    public static void swap(int[] nums, int i, int j) {

        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }


}
