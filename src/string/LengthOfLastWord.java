package string;

import java.util.Arrays;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String str= "we were getting and preparing our test ASA possible";
        System.out.println(lengthOfLastWord(str));
        System.out.println(lengthOfLastWord2(str));
    }
    public static int lengthOfLastWord(String str){

        String[] words=str.split(" ");
        String lastWord=words[words.length-1];
        return lastWord.length();
    }
    public static int lengthOfLastWord2(String str){
        int right = str.length()-1;
        int left = right;
        while(left>0 && str.charAt(left)!=' '){
            left--;
        }
        return right-left;
    }
}
