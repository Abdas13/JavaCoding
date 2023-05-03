package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicate2 {
    public static void main(String[] args) {
        Integer arr[]={1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8};
//        List<Integer>listOfSingle=new ArrayList<>();
//        for (int i = 0; i < arr.length ; i++) {
//            if(!listOfSingle.contains(arr[i])){
//                listOfSingle.add(arr[i]);
//            }else{
//                continue;
//            }
//        }

//        System.out.println(listOfSingle);
        Set<Integer> setOfSingles=new HashSet<>();
        for (int i = 0; i < arr.length ; i++) {
            setOfSingles.add(arr[i]);
        }
        System.out.println(setOfSingles);
    }
}
