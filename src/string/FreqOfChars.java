package string;

import java.util.HashMap;
import java.util.Map;

public class FreqOfChars {

    public static void main(String[] args) {
        String str = "aabcccddaaaac";
         // Find the occurances of chars  output : a6b1c4d2
        //  output : a2b1c3d2a4c1
        System.out.println(countChars(str));
        System.out.println(countCharAndWrite(str));
    }
    public static String countChars(String str){

        Map<Character, Integer> hmap = new HashMap<>();
        for(char ch: str.toCharArray()){
            hmap.put(ch, hmap.getOrDefault(ch,0)+1);
        }
        System.out.println(hmap);
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Character, Integer> entry: hmap.entrySet()){
            sb.append(entry.getKey()).append(entry.getValue());
        }
        return sb.toString();
    }
    public static String countCharAndWrite(String str){
        int left = 0;
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for (int right = 0; right < str.length(); right++) {
            if(str.charAt(left)==str.charAt(right)){
                count++;
            }else{
                sb.append(str.charAt(left)).append(count);
                left=right;
                count=1;
            }
        }
        return sb.append(str.charAt(left)).append(count).toString();
    }
}
