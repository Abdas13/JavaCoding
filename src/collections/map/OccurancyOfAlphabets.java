package collections.map;

import java.util.HashMap;
import java.util.Map;

import static java.lang.Integer.MIN_VALUE;

public class OccurancyOfAlphabets {
    static final int ALPHABET_SIZE = 26;
    public static void main(String[] args) {

        String str = "leetcode";
        System.out.println(isOccurAll(str));
    }
    public static boolean isOccurAll(String str){

        Map<Character,Integer> hm = new HashMap<>();
        char[] ch = str.toCharArray();

        for (char c:ch) {
            hm.put(c, hm.getOrDefault(c,0)+1);
        }
//        System.out.println(hm);
//        System.out.println(hm.size());

        int mostOccuranced = MIN_VALUE;
        for (int max:hm.values()) {
            mostOccuranced=Math.max(mostOccuranced,max);
        }
        System.out.println(mostOccuranced);


        return hm.size()==ALPHABET_SIZE;
    }
}
