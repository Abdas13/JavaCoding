package collections;

import java.util.*;

public class FindMaxAndSecondMax {
    public static void main(String[] args) {
        Integer arr[] = {3, 7, 15, 4, 87, 33, 25};
        int maximum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maximum) {
                maximum = arr[i];
            }
        }
        System.out.println("max number is: "+maximum);
        System.out.println(Arrays.toString(arr));
        List<Integer> list=new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
            Collections.sort(list);
        }
        System.out.println(list);
        System.out.println("second max number is: "+list.get(list.size()-2));
            }
        }
