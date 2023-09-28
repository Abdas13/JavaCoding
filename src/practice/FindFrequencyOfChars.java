package practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindFrequencyOfChars {
    public static void main(String[] args) {
        Map<Character,Integer>map;
            map=findFrequency("Java J2EE Java J2EE JavaScript");
        for(Map.Entry<Character,Integer>entry:map.entrySet()){
            System.out.println("Frequency of chars : "+entry.getKey()+" is "+entry.getValue());
        }
    }
    public static Map<Character, Integer> findFrequency(String input) {
        char[] arr=input.toLowerCase().replaceAll("\\s","").toCharArray();
        Map<Character,Integer>frequency=new HashMap<>();

        for (char c: arr){
            if(frequency.containsKey(c)){
                frequency.put(c, frequency.get(c)+1);
            }else{
                frequency.put(c, 1);
            }
        }
        return frequency;
    }
}
