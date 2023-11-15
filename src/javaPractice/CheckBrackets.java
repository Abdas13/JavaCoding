package javaPractice;

import java.util.ArrayList;

public class CheckBrackets {
    public static void main(String[] args) {
        String str1 = "()[]{}";
        String str2 = "()}";
        String str3 = "][";
        String str4 = "({}";
        String str5 = "[(){()}]";
        boolean check1=check(str1);
        System.out.println("check1 = " + check1);
        boolean check2=check(str2);
        System.out.println("check2 = " + check2);
        boolean check3=check(str3);
        System.out.println("check3 = " + check3);
        System.out.println("check4 = "+check(str4));
        System.out.println("check5 = "+check(str5));

//        System.out.println(checkBrackets(str2));
    }

    public static boolean check(String str) {
        boolean result = true;
        char[] chars = str.toCharArray();
        ArrayList<String> arr = new ArrayList<>();
        if (chars.length % 2 == 0) {
            if(chars.length>2){
                for (int i = 0; i <=(chars.length / 2)+2; i += 2) {
                    char aChar = chars[i];
                    char bChar = chars[i + 1];
                    String x = "" + aChar + bChar;
                    arr.add(x);
                }
            }else {
                for (int i = 0; i <= (chars.length / 2); i += 2) {
                    char aChar = chars[i];
                    char bChar = chars[i + 1];
                    String x = "" + aChar + bChar;
                    arr.add(x);
                }
            }
            System.out.println("arr = " + arr);
            for (String s : arr) {
                char[] chars1 = s.toCharArray();
                char aChar = chars1[0];
                int a= aChar;
                char bChar = chars1[ 1];
                int b= bChar;
                if((a>b)||((b-a)>2)){
                    result= false;
                }
            }
        }else{
            result=false;}
        return result;
    }
    public static boolean checkBrackets(String str){
        if(str.startsWith("]") || str.startsWith("}") || str.startsWith(")") ) return false;
        if((str.contains("[") && !str.contains("]")) ||
                (str.contains("(") && !str.contains(")")) ) return false;

        return true;
    }
}
