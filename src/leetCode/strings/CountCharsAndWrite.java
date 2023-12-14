package leetCode.strings;

import java.util.Map;
import java.util.TreeMap;

public class CountCharsAndWrite {
    public static void main(String[] args) {
        String str = "aabcccddaaaac";
        //output=a2b1c3d2a4
//        System.out.println(countChars(str).toString());
//        System.out.println(countandWrite(str));
//        System.out.println(occurances(str));
//        System.out.println(frequencyOfLetters(str));
        System.out.println(newMethod(str));

    }
    public static StringBuilder countChars(String str) {
        StringBuilder sb = new StringBuilder();
        String[] s = str.split("");
        int counter = 0;
        String previous = "";
        for (String each : s) {
            if (!each.equals(previous)) {
                if (counter != 0) {
                    sb.append(previous).append(counter);
                }
                counter = 1;
                previous = each;
            } else {
                counter++;
            }
        }
        return sb.append(previous).append(counter);
    }

    public static StringBuilder countandWrite(String input) {
//         String str = "aabcccddaaaac"
        StringBuilder sb = new StringBuilder();
        int count = 0;
        int left = 0;
        for (int right = 0; right < input.length(); right++) {
            if (input.charAt(left) == input.charAt(right)) {
                count++;
            } else {
                sb.append(input.charAt(left)).append(count);
                left = right;
                count = 1;
            }
        }
        return sb.append(input.charAt(left)).append(count);
    }
    public static String occurances(String str){

        String[] ch = str.toLowerCase().replace(" ", "").split("");
        Map<String, Integer> tMap= new TreeMap<>();
        for (String c:ch) {
            tMap.put(c, tMap.getOrDefault(c,0)+1);
        }
        return writeOccurances(tMap);
    }
    public static String writeOccurances(Map<String, Integer> tMap){

        StringBuilder orderedStr = new StringBuilder();
        for (Map.Entry<String, Integer>entry:tMap.entrySet()) {
            orderedStr.append(entry.getKey()).append(entry.getValue());
        }
        return orderedStr.toString();
    }
    public static String frequencyOfLetters(String str){
        String[] ch = str.toLowerCase().split("");
        Map<String, Integer> tmap = new TreeMap<>();
        for(String c: ch){
            tmap.put(c,tmap.getOrDefault(c,0)+1);  // it gives the frequency
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Integer> entry: tmap.entrySet()){
            sb.append(entry.getKey()).append(entry.getValue());
        }
        return sb.toString();
    }
    public static String newMethod(String s){
        int left=0;
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for (int right = 0; right < s.length(); right++) {
            if(s.charAt(right)==s.charAt(left))
                count++;
            else {
                sb.append(s.charAt(left)).append(count);
                left = right;
                count = 1;
            }
        }
        return sb.append(s.charAt(left)).append(count).toString();
    }
}
