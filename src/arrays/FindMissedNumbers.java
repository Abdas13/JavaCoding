package arrays;

import leetCode.binary.BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindMissedNumbers {

    public static List<Integer> findMissedNums(int[] nums) {
        List<Integer> listNum = new ArrayList<>();
        List<Integer> newNums = new ArrayList<>();
        List<Integer> missedNums = new ArrayList<>();
        for (int i = 0; i <= 100; i++) {
            listNum.add(i);
        }
        for (int j = 0; j < nums.length; j++) {
            newNums.add(nums[j]);
        }
//        System.out.println(newNums);
       for (int k=0; k< newNums.size();k++){
           if(!newNums.contains(listNum.get(k))){
                   missedNums.add(k);
               }
       }
       return missedNums;
    }
//    public static List<Integer> missedNumbers(int[] nums){
//        List<Integer>missedNumbers=new ArrayList<>();
//        for (int i=1; i<=nums[nums.length-1]; i++ ){
//            if(nums[i-1]+1!=nums[i]){
//                missedNumbers.add(nums[i-1]+1);
//            }
//        }
//        return missedNumbers;
//    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9,
                11, 12, 13, 14, 15, 16, 17, 18,
                19, 20, 21, 22, 23, 24, 25, 26,
                27, 28, 29, 30, 31, 32, 34, 35,
                36, 37, 38, 39, 40, 41, 42, 43,
                44, 45, 46, 48, 49, 50, 51, 52,
                53, 54, 55, 56, 57, 58, 59, 60,
                61, 62, 63, 64, 65, 66, 67, 68,
                69, 70, 71, 72, 73, 74, 75, 76,
                77, 78, 79, 80, 81, 82, 83, 84,
                86, 87, 88, 89, 90, 91, 92, 93,
                94, 95, 97, 98, 99, 100};
        System.out.println(findMissedNums(nums));
        System.out.println(nums[nums.length - 1]);
//        System.out.println(missedNumbers(nums));
    }
}
