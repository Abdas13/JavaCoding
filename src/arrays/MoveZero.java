package arrays;

import java.util.Arrays;

public class MoveZero {
    //Input nums=[0,1,2,0,3,0,7,13]
    //Output =[1,2,3,7,13,0,0,0]
    public static int[] moveZeros(int nums[]){

        int left=0;
        for (int right = 0; right <nums.length ; right++) {
            if(nums[right]!=0){
                nums[left]=nums[right];
                left++;
            }
        }
        for (int i = left; i < nums.length ; i++) {
            nums[i]=0;
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] nums={0,1,2,0,3,0,7,13};
        System.out.println(Arrays.binarySearch(nums,7));
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        System.out.println(Arrays.toString(moveZeros(nums)));
    }

}
