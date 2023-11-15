package hackerrank.strings;

import challenge.CompareArrays;

import java.util.*;
import java.util.stream.Stream;

public class Anagrams {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();

        scan.close();
        boolean ret = isStringAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
    private static boolean isStringAnagram(String a, String b) {
        char[] a1=a.toUpperCase().toCharArray();
        char[] b1=b.toUpperCase().toCharArray();
        if (a1.length != b1.length) return false;
        Arrays.sort(a1);
        Arrays.sort(b1);
        return Arrays.equals(a1, b1);
    }
}
