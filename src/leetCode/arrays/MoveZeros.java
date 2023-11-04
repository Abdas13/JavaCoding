package leetCode.arrays;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        //Input nums=[0,1,2,0,3,0,7,13]
        //Output =[1,2,3,7,13,0,0,0]
        int[] nums={0,1,2,0,3,0,7,13};
        System.err.println((Arrays.toString(moveZeros(nums))));


//        moveZeros2(nums);
    }
    public static int[] moveZeros(int[] nums){
        if (nums.length==1) return nums;
        int left=0;
        int right;
        for (right = 0; right < nums.length; right++) {
            if(nums[right]!=0){
                nums[left]=nums[right];
                left++;
            }
        }
        for (int i = left; i <nums.length ; i++) {
            nums[i]=0;
        }
        return nums;
    }
    public static int[] moveZeros2(int[] nums){

        return nums;
    }
}
