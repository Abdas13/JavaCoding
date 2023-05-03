package challenge;

import java.util.HashSet;
import java.util.Set;

public class CompareArrays {
    public static void main(String[] args) {

        int[] a1= {1,2,3,2,1};
        int[] a2= {3,1,2};
        boolean result=isSame(a1,a2);
        System.out.println(result);
    }

    private static boolean isSame(int[] a1, int[] a2) {
        Set<Integer> a1Elements=new HashSet<>();
        Set<Integer> a2Elements=new HashSet<>();

        for(int i=0; i<a1.length;i++){
            a1Elements.add(a1[i]);
        }
        for(int i=0; i<a2.length;i++){
            a2Elements.add(a2[i]);
        }
        if (a1Elements.size() != a2Elements.size()){
            return false;
        }
        for (Integer num : a1Elements){
            if (! a2Elements.contains(num)){
                return false;
            }
        }
        return true;

    }
}
