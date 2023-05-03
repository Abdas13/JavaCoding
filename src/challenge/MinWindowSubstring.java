package challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class MinWindowSubstring {
    public static void main(String[] args) {
        String[] str  ={"hamzb", "lamza"};

        minWindowSubstring(str);

    }
    public static String minWindowSubstring(String[] strArr){

        StringBuilder sb0=new StringBuilder(strArr[0]);
        StringBuilder sb1=new StringBuilder(strArr[1]);

        System.out.println(sb0.compareTo(sb1));


        return strArr[0];
    }
}
