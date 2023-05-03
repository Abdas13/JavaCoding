package arrays;

import java.util.Arrays;

public class SortNumbers {
    public static void main(String[] args) {
         int[] arr={8,13,7,6,23,45,2,8,11};
        Arrays.sort(arr);

        System.out.println("with method :"+Arrays.toString(sortArray(arr)));

//        System.out.println("Modified arr : "+Arrays.toString(arr));
        System.out.printf("Modified arr : %s",Arrays.toString(arr));
    }
    public static int[] sortArray(int nums[]){
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length ; j++) {
                if (nums[i]>nums[j]){
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        return  nums;
    }
}
