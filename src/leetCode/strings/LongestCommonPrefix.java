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
        System.out.println(longestComPrefix(strs));
        System.out.println(longestComPrefix(str));
    }
}
