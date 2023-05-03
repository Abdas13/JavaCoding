package javaPractice;

import java.util.HashSet;
import java.util.Set;

public class IsAnagram {
    public static void main(String[] args) {
        String str1="abcdab";
        String str2="acb";

        Set<Character > set1=new HashSet<>();
        Set<Character > set2=new HashSet<>();

        for (int i = 0; i <str1.length() ; i++) {
            set1.add(str1.charAt(i));
        }
        for (int i = 0; i <str2.length() ; i++) {
            set2.add(str2.charAt(i));
        }
        if(set1.size()!= set2.size()){
            System.out.println("ReverseOfString are NOT Anagram");

        } else if(set1.equals(set2)){
            System.out.println("ReverseOfString are Anagram");

        }else{
            System.out.println("ReverseOfString are NOT Anagram");
        }
    }
}
