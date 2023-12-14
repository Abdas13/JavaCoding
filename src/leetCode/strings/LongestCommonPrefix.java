package leetCode.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestCommonPrefix {

    // ["flower", "flow", "flight"]
    public static String longestComPrefix(String[] strs){
        if(strs.length==0)
            return "";
        String prefix = strs[0];
        for (int i=1; i<strs.length; i++){
            while (strs[i].indexOf(prefix)!=0){
                prefix = prefix.substring(0,prefix.length()-1);
                if(prefix.isEmpty())
                    return "";
            }
        }
        return prefix;
    }
    public static void main(String[] args) {
        String[] strs= {"flower","flow","flight"};
        String[] str = {"choosen","copen", "cbroken" };
//        System.out.println(longestComPrefix(strs));
//        System.out.println(longestComPrefix(str));

        System.out.println(longestCommonPrefix(str));
    }
    public static String longestCommonPrefix(String[] s){
        for (int i = 0; i < s.length-1; i++) {
            for (int j = 0; j < s[1].length(); j++) {  // s[1] is not dynamic
                if (s[i].charAt(j)==s[i+1].charAt(j)){

                }else{
                    return s[i].substring(0,j);
                }
            }
        }
        return "";
    }
}
