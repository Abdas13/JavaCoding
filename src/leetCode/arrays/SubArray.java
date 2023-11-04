package leetCode.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubArray {
    public static void main(String[] args) {
        System.out.println(sumOfSubs(List.of(1,-2,4,-5,1)));
    }
    public static int sumOfSubs(List<Integer> nums ){
        List<List<Integer>> upperList = new ArrayList<>();
        for (int i = 0; i < nums.size(); i++) {
            for (int j = i; j < nums.size(); j++) {
                upperList.add(nums.subList(i, j+1));
            }
        }
        System.out.println(upperList);
        int counter=0;

        for (int i = 0; i <upperList.size() ; i++) {
            int sum=0;
            for (int j = 0; j < upperList.get(i).size() ; j++) {
                sum += upperList.get(i).get(j);
            }
            if(sum<0) counter++;
        }
      return counter;
    }
}
