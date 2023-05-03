package string;

import java.util.*;

public class StringToHashMap {

    public static void main(String[] args) {
        String str="aaaccccbb";
        //occurances(str);
        System.out.println(sortStringByFrequency(str));
    }
    public static void occurances(String str){
        Map<Character, Integer> hmap=new TreeMap<>();
        for (char ch:str.toCharArray()) {
           hmap.put(ch,hmap.getOrDefault(ch,0)+1);
        }
        System.out.println(hmap.entrySet());
    }
    public static String sortStringByFrequency(String str) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : str.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        PriorityQueue<Character> priorityQueue = new PriorityQueue<>((a, b) -> frequencyMap.get(b) - frequencyMap.get(a));
        priorityQueue.addAll(frequencyMap.keySet());

        StringBuilder result = new StringBuilder();
        while (!priorityQueue.isEmpty()) {
            char currentChar = priorityQueue.poll();
            int currentCharFrequency = frequencyMap.get(currentChar);
            for (int i = 0; i < currentCharFrequency; i++) {
                result.append(currentChar);
                // hey
            }
        }

        return result.toString();
    }
    public static String sortStringByFrequency2(String str) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : str.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        List<Map.Entry<Character, Integer>> entries = new ArrayList<>(frequencyMap.entrySet());
        Collections.sort(entries, (a, b) -> b.getValue() - a.getValue());

        StringBuilder result = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : entries) {
            char currentChar = entry.getKey();
            int currentCharFrequency = entry.getValue();
            for (int i = 0; i < currentCharFrequency; i++) {
                result.append(currentChar);
            }
        }

        return result.toString();
    }

}
