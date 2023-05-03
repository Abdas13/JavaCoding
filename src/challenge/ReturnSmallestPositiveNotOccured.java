package challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReturnSmallestPositiveNotOccured {
    public static void main(String[] args) {
//        int[] nums={1,-2,5,4,2};
        int[] nums={-3,-4,-5,1,2,5};
        System.out.println(findSmallest(nums));

        System.out.println(findLeastPositive(nums));


    }
    public static int findSmallest(int[] nums){
        Arrays.sort(nums);
        List<Integer> list1=new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list1.add(nums[i]);
        }
        if (list1.get(list1.size()-1)<=0){
            return 1;
            }
        for (int i = 0; i < list1.size(); i++) {
            if((list1.get(i)>0 && !list1.contains(list1.get(i)+1))) {
                return list1.get(i) + 1;
            }
            }
        return 1;
}
    public static int findLeastPositive(int[] nums){
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i+1; j <nums.length ; j++) {
//                while (nums[i]>nums[j]){
//                    int temp=nums[i];
//                    nums[i]=nums[j];
//                    nums[j]=temp;
//                }
//            }
//        }
//        for (int i = 0; i < nums.length; i++) {
//            if(nums[i]>=0){
//                for (int j = 1; j <nums.length ; j++) {
//                    if(nums[j]!=1) return 1;
//                    else if(nums[j-1]+1!=nums[j]){
//                        return nums[j-1]+1;
//                    }
//                }
//            }
//
//        }
//
        return 1;

}
}
