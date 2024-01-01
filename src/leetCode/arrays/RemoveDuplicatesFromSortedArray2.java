package leetCode.arrays;

import java.io.FilterOutputStream;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class RemoveDuplicatesFromSortedArray2 {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,1,2,3,3};
        int[] nums2 = {1,1,1,2,2,3};
//        System.out.println(removeDuplicatesByTreeMap(nums));
//        System.out.println(removeDuplicates(nums));
        System.out.println(removeDuplicates(nums2));
        System.out.println(remDups(nums));
    }
    // using TreeMap
    public static int removeDuplicatesByTreeMap(int[] nums) {
        Map<Integer, Integer> tmap = new TreeMap<>();
        for (Integer num : nums) {
            tmap.put(num, tmap.getOrDefault(num, 0) + 1);
            if (tmap.get(num) > 2) tmap.put(num, tmap.getOrDefault(num, 0) - 1);
        }
        int remains = 0;
        for(Map.Entry<Integer,Integer>entry: tmap.entrySet()){
            remains += entry.getValue();
        }
        return remains;
    }
    // in-place solution
    public static int removeDuplicates(int[] nums){
        int left = 0;
        int count = 1;
        for (int right = 1; right < nums.length; right++) {
            if (nums[right]!=nums[left]){
                count=1;
                left++;
                nums[left]=nums[right];
            }else{
                count++;
                if(count>2){
                    nums[left]=nums[right];
                    count--;
                }
                else{
                    left++;
                    nums[left]=nums[right];
                }
            }
        }
        System.out.println(Arrays.toString(nums));
        return left+1;
    }
    public static int remDups(int[] nums){

        int left = 1, count = 1;

        for (int right = 1; right < nums.length; right++) {
             if(nums[right]==nums[right-1]){
                 count++;
             }else {
                 count=1;
             }
             if (count<=2){
                 nums[left]=nums[right];
                 left++;
             }
        }
        return left;
    }
}
