package leetCode.strings;

import java.util.Arrays;

public class IsStringPalindrome {
    public static void main(String[] args) {
        /*
        A phrase is a palindrome if, after converting all uppercase letters into lowercase letters
        and removing all non-alphanumeric characters, it reads the same forward and backward.
        Alphanumeric characters include letters and numbers.
        Example 1:  "A man, a plan, a canal: Panama"
       output : true
       Example 2: "race a car"
       output: false
         */
        String s = "A man, a plan, a canal: Panama";

        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s){
      int left = 0;
      int right = s.length()-1;
      while(left<right){
          if(!Character.isLetterOrDigit(s.charAt(left))) {
              left++;
          }else if(!Character.isLetterOrDigit(s.charAt(right))) {
              right--;
          }else {
              if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                  return false;
              }
              left++;
              right--;
          }
      }
        return true;
    }
}
