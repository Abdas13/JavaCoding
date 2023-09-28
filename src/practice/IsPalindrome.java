package practice;

import java.util.Arrays;

public class IsPalindrome {

    public static boolean isPalindrome(char[] ch){

        char[] first = ch;
        int left = 0;
        int right = ch.length-1;
        while (left<right) {
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;
        }
        // find a better solution
        System.out.println(ch);
        System.out.println(first);
        return Arrays.equals(ch, first);
    }

    public static void main(String[] args) {

        String str = "mada";
        System.out.println(isPalindrome(str.toCharArray()));
    }
}
