package leetCode.integers;

import java.util.*;

public class FindSingleNumber {

    public static int findSingleNum(int[] nums){
        if(nums.length==1)
            return nums[0];
        Set<Integer> set=new HashSet<>();
        for (int i=0; i<nums.length; i++){
            if (set.contains(nums[i])){
                set.remove(nums[i]);
            }else {
                set.add(nums[i]);
            }
        }
        return set.iterator().next();
    }

    public static void main(String[] args) {
        int[] nums={4,2,1,2,1,3,3};
        System.out.println(findSingleNum(nums));
        System.out.println(findSingleNumber(nums));
    }
    public static int findSingleNumber(int[] nums){

        List<Integer>list=new ArrayList<>();
        System.out.println(list);
        if (nums.length==1){
            list.add(nums[0]);
//            return list;
        }
        for(Integer num:nums){
            for (Integer num1:nums) {
                if (list.contains(num)) {
                    list.remove(num);

                } else {
                    list.add(num);
                }
            }
        }
//        return list;
        return list.iterator().next();
}
}