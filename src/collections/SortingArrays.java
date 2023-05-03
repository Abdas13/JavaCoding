package collections;

import java.util.Arrays;

public class SortingArrays {
    public static void main(String[] args) {

        String[] names={"Kevin","Adam","George"};
        Arrays.sort(names);

        int[] nums={1,5,10,-4,7,6,10,17};
        Arrays.sort(nums);

        for (int i = 0; i <nums.length ; i++) {
            System.out.print(nums[i]+",");
        }
        System.out.println();
        for (int j = nums.length-1; j >=0 ; j--) {
            System.out.print(nums[j]+",");
        }
        System.out.println();
        for (int i = 0; i < names.length ; i++) {
            System.out.print(names[i]+"--");

        }
    }
}
