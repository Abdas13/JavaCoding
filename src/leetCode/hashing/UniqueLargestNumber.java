package leetCode.hashing;

import java.util.HashMap;
import java.util.Map;

public class UniqueLargestNumber {
    /*
    Given an integer array nums, return the largest integer that
    only occurs once. If no integer occurs once, return -1.
    Input: nums = [5,7,3,9,4,9,8,3,1]
   Output: 8
   Explanation: The maximum integer in the array is 9 but it is repeated.
   The number 8 occurs only once, so it is the answer.
     */
    public static void main(String[] args) {
        int[] nums = {5,7,3,9,4,9,8,3,1};
        System.out.println(largestUniqueNumber(nums));

    }
    public static int largestUniqueNumber(int[] nums){
        Map<Integer, Integer> freq = new HashMap<>();
        for(int num: nums){
            freq.put(num, freq.getOrDefault(num,0)+1);
        }
        int ans = 0;
        for(Map.Entry<Integer, Integer> entry: freq.entrySet()){
            if(!freq.containsValue(1))
                return -1;
            if(entry.getValue()==1)
                ans = Math.max(ans, entry.getKey());
        }
        return ans;
    }
}
