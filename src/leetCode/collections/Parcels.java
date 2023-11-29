package leetCode.collections;

import java.util.*;

public class Parcels {
    public static void main(String[] args) {
        List<Integer> parcels = new ArrayList<>(List.of(2, 3, 5, 4, 2));
        System.out.println(numOfDays(parcels));
    }
    public static int numOfDays(List<Integer> parcels) {
        Set<Integer> hs = new HashSet<>(parcels);
        return hs.size();
    }
}
