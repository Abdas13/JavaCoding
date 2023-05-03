package string;

import java.util.HashMap;
import java.util.Map;

public class EvenNumLetters {
    public static void main(String[] args) {
        String str="aaaabbbbb";
//        System.out.println(doEvenOccurances(str));
        System.out.println(evenOccurs(str));
    }
    public static int doEvenOccurances(String str){
        StringBuilder sb=new StringBuilder(str);
        int counterA=0;
        int counterB=0;
        return 15;
    }
    public static int evenOccurs(String str){
     Map<Character, Integer> freqMap = new HashMap<>();
        for (char ch:str.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch,0)+1);
        }
        int oddCounter=0;
        for (int count: freqMap.values()) {
            if (count%2!=0){
                oddCounter++;
            }
        }

        System.out.println(freqMap.entrySet());
        for (char c: freqMap.keySet()) {
            if(freqMap.get(c)%2!=0){
                freqMap.put(c,freqMap.getOrDefault(c,0)-1);
            }
        }
        System.out.println(freqMap.entrySet());

        return oddCounter;


    }

}
