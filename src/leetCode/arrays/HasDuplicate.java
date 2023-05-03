package leetCode.arrays;

import java.util.*;

public class HasDuplicate {
    public static void main(String[] args) {
       int[] nums ={1,2,3,4,3,5,6,7};
       System.out.println(containsDuplicate(nums));
    }
    public static boolean containsDuplicate(int[] nums){
//        List<Integer> set =new ArrayList<>();
        Set<Integer> set= new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            if(set.contains(nums[i])){
                return true;
            }else{
                set.add(nums[i]);
            }
        }
      return false;
    }
}
