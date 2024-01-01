package string;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class OrderDependingOnOccurances {

    public static void main(String[] args) {
        String str = "aaaaabbbccccccdd";
        System.out.println(orderTheOccurences(str));
    }
    public static String orderTheOccurences(String s){

        HashMap<Character, Integer> freq = new HashMap<>();
        Queue<HashMap<Character, Integer>> occur = new PriorityQueue<>();

        for(char c: s.toCharArray()){
            freq.put(c, freq.getOrDefault(c,0)+1);
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : freq.entrySet()){
            int occurance = entry.getValue();
            char letter = entry.getKey();
        }
        System.out.println(occur);
        return null;
    }
}
