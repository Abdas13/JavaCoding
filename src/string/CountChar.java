package string;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class CountChar {
    //Count each char in the string program
    public static void main(String[] args) {
        String word="Karakalem";

        System.out.println(countChars(word));
    }
    public static Map<Character, Integer> countChars(String str){
        str = str.toLowerCase();
        Map<Character, Integer> hm = new HashMap<>();
        char[] ch=str.toCharArray();
        for (char c: ch) {
            if(hm.containsKey(c)){
                hm.put(c, hm.get(c)+1);
            }else {
                hm.put(c,1);
            }
        }
        return hm;
    }
}
