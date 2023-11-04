package leetCode.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Parcels {
    public static void main(String[] args) {
        List<Integer>parcels=new ArrayList<>(List.of(2, 3, 5, 4, 2));
          // [5,5,5,5,5]  output=1
        //
    }
    public static int numOfDays(List<Integer> parcels){

        Collections.sort(parcels); // [2,2,3,4,5]

        return parcels.get(parcels.size()-1)- parcels.get(0)+1;

    }
}
