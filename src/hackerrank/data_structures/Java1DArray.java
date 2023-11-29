package hackerrank.data_structures;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Java1DArray {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";

        System.out.println(reverseWords(s));


    }
    public static String reverseWords(String s) {

        return Arrays.stream(s.split(" "))
                .map(str-> new StringBuilder(str).reverse().toString())
                .collect(Collectors.joining(" "));
    }
    public static String reverse(char[] ch, int left, int right){
        while (left<right){
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;
        }
        return Arrays.toString(ch);
    }

}
