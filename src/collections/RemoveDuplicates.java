package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args) {
        // ArrayList with duplicate elements
        ArrayList<Integer> numbersList = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8));
        int [] arr1={1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8};

        System.out.println("ArrayList with duplicate elements: "+ numbersList);

//        LinkedHashSet<Integer>singleElements=new LinkedHashSet<>(numbersList);
//        System.out.println(singleElements);
        List<Integer> newList=new ArrayList<>();
        for (int i = 1; i <=8; i++) {
            if(!newList.contains(i)){
                newList.add(i);
            }
        }
        System.out.println(newList);
    }
}
