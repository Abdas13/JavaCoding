package leetCode.arrays.sliding_window;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class MaxVowelsInSubstring {
    public static void main(String[] args) {
        /*
    Given a string s and an integer k, return the maximum number
    of vowel letters in any substring of s with length k.

     Vowel letters in English are 'a', 'e', 'i', 'o', and 'u'.
     Input: s = "leetcode", k = 3
Output: 2
Explanation: "lee", "eet" and "ode" contain 2 vowels.
     */
        String s = "leetcode";
        int k = 3;
        System.out.println(maxVowels(s,k));


    }
    public static int maxVowels(String s, int k){
        HashSet<Character> set= new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        int vowel = 0;
        for (int i = 0; i < k; i++) {
            if(set.contains(s.charAt(i)))
                vowel++;
        }
        int maxVowel = vowel;
        for (int i = k; i < s.length() ; i++) {
            if(set.contains(s.charAt(i-k))) vowel--;
            if (set.contains(s.charAt(i))) vowel++;
            maxVowel = Math.max(maxVowel, vowel);
        }
        return maxVowel;
        }
}
