package leetCode.arrays;

import java.util.*;

public class ZeroSumOfTriplets {
    public static void main(String[] args) {
       int[] nums = {-1,0,1,2,-1,-4};
        //Output: [[-1,-1,2],[-1,0,1]]
        System.out.println(threeSum(nums));
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> upperList = new HashSet<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length-2; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    upperList.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                }
                else if (sum < 0)
                    left++;
                else
                    right--;
            }
        }
        return new ArrayList<>(upperList);
    }
}
