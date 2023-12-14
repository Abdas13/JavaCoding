package leetCode.hashing;

import java.util.HashSet;
import java.util.Set;

public class FirstRepeatedChar {
    public static void main(String[] args) {
        /*
         First Letter to Appear Twice
Given a string s, return the first character to appear twice.
It is guaranteed that the input will have a duplicate character.
         */
        String s= "abcdeda";
        System.out.println(repeatedChar1(s));
        System.out.println(repeatedChar2(s));
    }
    public static char repeatedChar1(String s){
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            for (int j = 0; j < i; j++) {
                if(s.charAt(j)==c) return c;
            }
        }
        return ' ';
    }
    public static char repeatedChar2(String s){
        Set<Character> hs = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if(hs.contains(s.charAt(i))) return s.charAt(i);
            else hs.add(s.charAt(i));
        }
        return ' ';
    }
}
