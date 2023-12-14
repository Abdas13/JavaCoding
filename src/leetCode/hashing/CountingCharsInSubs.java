package leetCode.hashing;

import java.util.HashMap;
import java.util.Map;

public class CountingCharsInSubs {

    public static void main(String[] args) {
        /*
        Example 1: You are given a string s and an integer k. Find the length of the longest
        substring that contains at most k distinct characters.
        For example, given s = "eceba" and k = 2, return 3. The longest substring with at most
        2 distinct characters is "ece".
         */
        String s = "eceba";
        int k = 2;
        System.out.println(findLongestSubstring(s,k));
    }
    public static int findLongestSubstring(String s, int k){
        Map<Character, Integer> counts = new HashMap<>();
        int left = 0, ans = 0;
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            counts.put(c,counts.getOrDefault(c,0)+1);
            while(counts.size()>k){
                counts.put(s.charAt(left), counts.getOrDefault(s.charAt(left),0)-1);
                if(counts.get(s.charAt(left))==0) {
                    counts.remove(s.charAt(left));
                }
                left++;
            }
            ans = Math.max(ans, right-left+1);
        }
        return ans;
    }
}
