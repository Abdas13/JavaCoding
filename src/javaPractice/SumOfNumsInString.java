package javaPractice;

import java.util.Arrays;

public class SumOfNumsInString {
    public static void main(String[] args) {
        String str="jav65ais38af3unn15ylang22uage";
        int sum=0;

        String cleanedStr=str.replaceAll("[a-z]"," ");
        String[] nums=cleanedStr.split("");
        System.out.println(cleanedStr);
    }
}
