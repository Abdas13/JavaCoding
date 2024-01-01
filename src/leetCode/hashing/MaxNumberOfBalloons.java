package leetCode.hashing;

import java.util.HashMap;

public class MaxNumberOfBalloons {
    public static void main(String[] args) {
        String s = "loonbalxballpoon";
        String text = "nlaebolko";
        String str = "leetcode";
        System.out.println(maxNumOfBalloons(str));
        System.out.println(maxNumOfBalloons(s));
        System.out.println(maxNumOfBalloons(text));
    }
    public static int maxNumOfBalloons(String s){
        HashMap<Character, Integer> balloon = new HashMap<>();
        HashMap<Character, Integer> freq = new HashMap<>(26);

        balloon.put('b',1);
        balloon.put('a',1);
        balloon.put('l',2);
        balloon.put('o',2);
        balloon.put('n',1);

        for (char ch : s.toCharArray()){
            freq.put(ch, freq.getOrDefault(ch,0)+1);
        }

        int ans = Integer.MAX_VALUE;
        for (char c : balloon.keySet()){
            if(freq.get(c)==null) return 0;
            ans = Math.min(ans, freq.get(c) / balloon.get(c));
        }
        return ans;
    }
}
