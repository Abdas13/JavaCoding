package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingCollections1 {
    public static void main(String[] args) {

        List<Integer> list=new ArrayList<>();
        list.add(6);
        list.add(4);
        list.add(-7);
        list.add(6);
        list.add(5);
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println();
        System.out.println(list);



    }
}
