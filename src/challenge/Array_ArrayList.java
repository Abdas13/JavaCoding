package challenge;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Array_ArrayList {
    public static void main(String[] args) {
        List<Integer> list1= Arrays.asList(10,4,-1,5);
        Collections.sort(list1);
        Integer array[]=list1.toArray(new Integer[4]);
        System.out.println(array[0]);
    }
}
