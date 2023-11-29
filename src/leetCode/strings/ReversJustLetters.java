package leetCode.strings;

import java.util.Arrays;

public class ReversJustLetters {
    public static void main(String[] args) {
        String s = "a-bC-dEf-ghIj";
        System.out.println(reverseOnlyLetters(s));

    }
    public static String reverseOnlyLetters(String s) {

        char[] ch = s.toCharArray();
        int left=0;
        int right = s.length()-1;
            while (left < right) {
                if(Character.isLetter(ch[left])&& Character.isLetter(ch[right])) {
                    char temp = ch[left];
                    ch[left] = ch[right];
                    ch[right] = temp;
                    left++;
                    right--;
                } else if (!Character.isLetter(ch[left])) {
                    left++;
                } else if (!Character.isLetter(ch[right])) {
                    right--;
                }
            }
           return new String((ch));
    }
}
