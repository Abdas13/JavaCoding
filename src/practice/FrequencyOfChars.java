package practice;

import java.util.Map;
import java.util.TreeMap;

public class FrequencyOfChars {

    public static void main(String[] args) {
        String str = "aabbbbcccaaad";
         // output 1 : a2b4c3a3d1
         // output 2 : a5b4c3d1
        System.out.println(frequencyOfChars(str));
        System.out.println(countCharAndWrite(str));
    }
    public static String frequencyOfChars(String str){  //output 2

        Map<Character, Integer> tMap = new TreeMap<>();
        for (char ch: str.toCharArray()){
            tMap.put(ch, tMap.getOrDefault(ch, 0)+1);
        }
//        String result="";
//        for (Map.Entry<Character, Integer> entry: tMap.entrySet()) {
//            result += "" + entry.getKey() + entry.getValue();
//        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Character, Integer> entry: tMap.entrySet()) {
            sb.append(entry.getKey()).append(entry.getValue());
        }
       return sb.toString();
//        return result;
    }

    public static String countCharAndWrite(String str){  // output 1

        int left = 0;
        StringBuilder sb = new StringBuilder();
        int counter = 0;
        for (int right = 0; right < str.length(); right++) {

            if(str.charAt(left)== str.charAt(right)){
                counter++;
            }else { // !=
                sb.append(str.charAt(left)).append(counter);
                left = right;
                counter = 1;
            }
        }
      return sb.append(str.charAt(left)).append(counter).toString();
    }
}
