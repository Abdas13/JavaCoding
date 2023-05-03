package leetCode.strings;

import java.security.Key;
import java.util.*;

public class SecondMostFrequentWord {

    /*
    Given a paragraph and a list of banned words, return the most frequent word that is not in the list of banned words.
It is guaranteed there is at least one word that isn't banned, and that the answer is unique.
Words in the paragraph are not case sensitive.  The answer is in lowercase.
     */
    public static void main(String[] args) {
        String str= "Bob hit a ball, the hit BALL 90 flew far after it was hit.";
        String[] banned={"hit"};

        System.out.println((secondMostFrequent(str,banned)));
        // output="ball"
    }
    public static String secondMostFrequent(String str, String[] banned){
        HashMap<String,Integer>hm=new HashMap<>();
        String[] s=str.toLowerCase().replaceAll("[^a-zA-Z0-9 ]","").split(" ");
        for (String each:s) {
            if (!hm.containsKey(each))
                hm.put(each, 1);
            else
                hm.put(each, hm.get(each) + 1);
        }
        hm.remove(banned[0]);
        return Collections.max(hm.entrySet(), Map.Entry.comparingByValue()).getKey();

        }
    }

