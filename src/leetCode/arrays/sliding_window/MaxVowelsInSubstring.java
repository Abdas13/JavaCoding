package leetCode.arrays.sliding_window;

public class MaxVowelsInSubstring {
    public static void main(String[] args) {
        /*
    Given a string s and an integer k, return the maximum number
    of vowel letters in any substring of s with length k.

     Vowel letters in English are 'a', 'e', 'i', 'o', and 'u'.
     Input: s = "leetcode", k = 3
Output: 2
Explanation: "lee", "eet" and "ode" contain 2 vowels.
     */
        String s = "leetcode";
        int k = 3;
        System.out.println(maxVowels(s,k));


    }
    public static int maxVowels(String s, int k){
        int left = 0;
        int curr = 0;
        int ans = 0;
        int count=0;
        for (int right = 0; right < s.length()-3; right++) {
            String str = s.substring(right, right+3);
            while(str.contains("[aeiou]")){
                count++;
            }
            ans = Math.max(ans, count);
            count=0;
        }
        return ans;

    }

}
