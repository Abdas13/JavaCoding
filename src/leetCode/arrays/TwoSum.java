package leetCode.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 5, 7, 15, 4, 10};   // a + b = c  ise b = c - a
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));

        System.err.println(sum2(nums, target));
    }

    public static int[] twoSum(int[] nums, int target) {

        int[] ans = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff)) {
                ans[0] = i;
                ans[1] = map.get(diff);
                break;
            } else {
                map.put(nums[i], i);
            }
        }
        System.out.println(map);
        return ans;
    }

    public static List<String> sum2(int[] nums, int target) {
        List<String> arrList = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] + nums[j] == target) {
                    arrList.add("" + nums[i] + "+" + nums[j] + "=" + target);
                }

            }

        }
        return arrList;
    }
}
