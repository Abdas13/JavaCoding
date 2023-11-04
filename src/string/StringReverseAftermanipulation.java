package string;

import java.util.Arrays;

public class StringReverseAftermanipulation {
    public static void main(String[] args) {
     String str = "hi.bro-it.was/fantastic";
        System.out.println(reverseAfterCleaning(str));
    }
    public static String reverseAfterCleaning(String str){

        String[] st =str.split("[^A-Za-z0-9]");
        String reversed = "";
        for (int i = st.length-1; i >=0; i--) {
            reversed +=st[i]+".";
        }
        return reversed.substring(0, reversed.length()-1);
    }
}
