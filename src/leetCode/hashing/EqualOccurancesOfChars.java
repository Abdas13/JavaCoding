package leetCode.hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class EqualOccurancesOfChars {
    /*
    1941. Check if All Characters Have Equal Number of Occurrences
    Given a string s, determine if all characters have the same frequency.
   For example, given s = "abacbc", return true. All characters appear twice.
   Given s = "aaabb", return false. "a" appears 3 times, "b" appears 2 times. 3 != 2.
     */
    public static void main(String[] args) {
        String s = "abacbc";
        System.out.println(areOccurencesEqual(s));

    }
    public static boolean areOccurencesEqual(String s){
        Map<Character, Integer> hm = new HashMap<>();
        for (char c: s.toCharArray()) {
            hm.put(c, hm.getOrDefault(c, 0)+1);
        }
        Set<Integer> frequency = new HashSet<>(hm.values());
        return frequency.size()==1;
    }
}
