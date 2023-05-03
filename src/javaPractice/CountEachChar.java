package javaPractice;

import java.util.HashMap;
import java.util.Map;

public class CountEachChar {
    public static void main(String[] args) {
        String str="Marmara and Gargara";
        String[] str1=str.toLowerCase().replace(" ","").split("");
        Map<String,Integer> map=new HashMap<>();
        for (String each:str1) {
            if (!map.containsKey(each)){
                map.put(each,1);
            }else {
                map.put(each, map.get(each)+1);
            }
        }
      System.out.println(map.entrySet());
    }
}
