package leetCode.arrays;

import java.util.*;

public class IntersectionValues {
    public static void main(String[] args) {
        int[] nums1 = {4,3,2,3,1};
        int[] nums2 ={2,2,5,2,3,6};
//        System.out.println(Arrays.toString(findIntersectionValues(nums1, nums2)));
        System.out.println(Arrays.toString(intersVal(nums1, nums2)));

    }
    public static int[] findIntersectionValues(int[] nums1, int[] nums2){
        int[] ans = new int[2];
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        int count = 0;
        for(int n1:nums1) s1.add(n1);
        for(int n2:nums2) s2.add(n2);
        for(int i=0; i<nums1.length; i++){
            if(s2.contains(nums1[i])) count++;
        }
        ans[0]=count;
        count=0;
        for(int i=0; i<nums2.length; i++){
            if(s1.contains(nums2[i])) count++;
        }
        ans[1]=count;
        return ans;
    }
    public static int[] intersVal(int[] nums1, int[] nums2){
        int[] ans = new int[2];
       HashMap<Integer, Integer> hm1 = new HashMap<>();
       HashMap<Integer, Integer> hm2 = new HashMap<>();

       for (int n1:nums1) hm1.put(n1, hm1.getOrDefault(n1,0)+1);
       for (int n2:nums2) hm2.put(n2, hm2.getOrDefault(n2, 0)+1);
       int value = 0;
       for (Map.Entry<Integer, Integer> entry: hm1.entrySet()){
           if(hm2.containsKey(entry.getKey()))
               value += entry.getValue();
       }
        ans[0] = value;
        value = 0;
        for (Map.Entry<Integer, Integer> entry: hm2.entrySet()){
            if(hm1.containsKey(entry.getKey()))
                value += entry.getValue();
        }
        ans[1] = value;
        return ans;
    }

}
