package practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ByteLimit {
    public static void main(String[] args) {
//        byte a=30, b=127;
//        a= (byte) (a+1);
//        b++;
//
//        System.out.println(a+", "+b);

//        int[] nums = {2,4,0,4,7,0,0,9,10};
//        System.out.println(Arrays.toString(moveZeros(nums)));
        int[] nums = {2, 5, 7, 15, 4, 10};
        int target = 9;
        System.out.println(Arrays.toString(sumOfTwoNums(nums, target)));
    }
    private static int[] moveZeros(int[] nums){
        if (nums.length==1) return nums;
        int left=0;
        for (int right=0; right< nums.length; right++){
            if (nums[right]!=0){
                nums[left]=nums[right];
                left++;
            }
        }
        for (int i=left; i< nums.length; i++){
            nums[i]=0;
        }
        return nums;
    }
    private static int[] sumOfTwoNums(int[] nums, int target){

        int[] result = new int[2];
        Map<Integer, Integer> hMap = new HashMap<>();
        int diff;
        for (int i=0; i< nums.length; i++){
            diff = target - nums[i];
            if (hMap.containsKey(diff)){
                result[0]=diff;  //result[0]=hMap.get(diff);
                result[1]=nums[i]; // result[1]=i;
                break;
            }else {
                hMap.put(nums[i],i);
            }
        }
        return result;
    }

}
