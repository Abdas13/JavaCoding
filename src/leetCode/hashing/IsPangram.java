package leetCode.hashing;

import java.util.HashSet;
import java.util.Set;

public class IsPangram {
    public static void main(String[] args) {
        /*
        A pangram is a sentence where every letter of the
        English alphabet appears at least once.
        Given a string sentence containing only lowercase
        English letters, return true if sentence is a pangram,
        or false otherwise.
         */
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        String s  = "leetcode";
        System.out.println(checkIfPangram(sentence));
        System.out.println(checkIfPangram(s));
    }
    public static boolean checkIfPangram(String s){
        Set<Character> hs = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            hs.add(s.charAt(i));
        }
        if(hs.size()!=26) return false;
        for (char i = 'a'; i < 'z' ; i++) {
            if (!hs.contains(i))
                return false;
        }
        return true;
    }
    public static boolean checkIfPangram2(String s){
        char curr =  'a';
        while(curr<(char)'z'+1){
            if(s.indexOf(curr)==-1)
                return false;
            else curr++;
        }
        return true;
    }

}
