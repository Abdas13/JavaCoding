package arrays;

import java.util.ArrayList;
import java.util.List;

public class MissedNumsInArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 6, 7, 8, 10, 11, 13, 18};
        System.out.println(listOfMissedNums(nums));
    }
    public static List<Integer> listOfMissedNums(int[] nums) {
        List<Integer> listOfMissed = new ArrayList<>();
        int left = 0;
        for (int right = 1; right < nums.length; right++) {
            if (nums[left] + 1 != nums[right]) {
                int temp= nums[left] + 1;
                while (temp!=nums[right]){
                    listOfMissed.add(temp++);
                }
                left++;
            }else{
                left++;
            }
        }
        return listOfMissed;
    }
}
