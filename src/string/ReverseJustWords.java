package string;

import java.util.Arrays;

public class ReverseJustWords {
    public static void main(String[] args) {
        String str = "Welcome to my home";
        String[] words =str.split("\\s");
        String reverseWords = "";
        for (String w : words) {
            StringBuilder sb = new StringBuilder(w);
            sb.reverse();
         reverseWords = reverseWords + sb+" ";
        }
        System.out.println(reverseWords);
        System.out.println(reverseWords(str));

    }
    public static String reverseWords(String sentence){
        String[] str= sentence.split(" ");
        String revWords = "";

        for (String w: str) {
            StringBuilder sb = new StringBuilder(w);
            sb.reverse();
            revWords = revWords + sb+" ";
        }
        return revWords;
    }
}
