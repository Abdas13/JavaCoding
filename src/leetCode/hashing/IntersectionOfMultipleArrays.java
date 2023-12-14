package leetCode.hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionOfMultipleArrays {
    public static void main(String[] args) {
        /*
        Given a 2D array nums that contains n arrays of distinct integers, return a sorted
        array containing all the numbers that appear in all n arrays.
       For example, given nums = [[3,1,2,4,5],[1,2,3,4],[3,4,5,6]], return [3, 4].
       3 and 4 are the only numbers that are in all arrays.
         */
        int[][] nums = {{3,1,2,4,5},{1,2,3,4},{3,4,5,6}};
        System.out.println(intersection(nums));
    }
    public static List<Integer> intersection(int[][] nums){
        Map<Integer, Integer> hm = new HashMap<>();
        for(int[] num: nums){
            for (int n:num){
                hm.put(n,hm.getOrDefault(n, 0)+1);
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int key: hm.keySet()){
            if (hm.get(key)==nums.length){
                ans.add(key);
            }
        }
        return ans;
    }
}
