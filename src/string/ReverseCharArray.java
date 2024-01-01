package string;

import java.util.Arrays;

public class ReverseCharArray {
    public static void main(String[] args) {
        String s = "gel buraya";
        System.out.println(reverse(s.toCharArray()));
        int num = 1234;
        System.out.println(reverse(String.valueOf(num).toCharArray()));
    }
    public static char[] reverse(char[] ch){

        int left = 0;
        int right = ch.length-1;

        while (left<right){
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;

        }
        return ch;
    }
}
