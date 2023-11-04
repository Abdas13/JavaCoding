package string;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

public class CountChar {
    //Count each char in the string program
    public static void main(String[] args) {
        String word="Karakalem";

        System.out.println(countChars(word));
        System.out.println(occurances(word));
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
    public static Map<String, Integer> occurances(String str){

        String[] ch = str.toLowerCase().replace(" ", "").split("");
        Map<String, Integer> tMap= new TreeMap<>();
        for (String c:ch) {
            tMap.put(c, tMap.getOrDefault(c,0)+1);
        }
        return tMap;
    }
}
