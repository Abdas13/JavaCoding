package collections.map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DistinctNumsSum {

    /*
    You are given an array of numbers, then you should fins the sum of uniques.
     */
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 2};  // output = 1+3 = 4

        System.out.println(sumOfUniques(nums));
    }

    private static int sumOfUniques(int[] nums) {

        /*Arrays.sort(nums);

        int sum = nums[0];

        int left =0;
        for (int right = 1; right < nums.length-1; right++) {

            if (nums[left]!=nums[right]){
                sum += nums[right];
                left=right;
            }else {
                left++;
            }
        }
        return sum;
    }

         */

        Map<Integer, Integer> hmap = new HashMap<>();
        int sum=0;

        for (Integer freq:nums) {
            hmap.put(freq, hmap.getOrDefault(freq,0)+1);
        }
        for (Map.Entry<Integer, Integer> entry: hmap.entrySet()) {
            if (entry.getValue()==1){
                sum += entry.getKey();
            }
        }
        return sum;
    }
}
