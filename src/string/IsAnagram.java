package string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IsAnagram {
    public static void main(String[] args) {
        String str1="abcba";
        String str2="abcab";
        System.err.println(isAnagram(str1,str2));
        }
    public static boolean isAnagram(String str1, String str2) {
        char[] ch1=str1.toCharArray();
        char[] ch2=str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1,ch2);
    }
}
