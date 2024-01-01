package string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StrongPassword {
    public static void main(String[] args) {

        String password = "aBc124dgh#";
        System.out.println(isPasswordStrong(password));
    }
    public static boolean isPasswordStrong(String s){

        if (s.length()< 8 || s.length()>22) return false;

        List<Character> lower = new ArrayList<>();
        List<Character> upper = new ArrayList<>();
        List<Character> digit = new ArrayList<>();
        List<Character> specs = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if(Character.isLowerCase(s.charAt(i)))
                lower.add(s.charAt(i));
            else if (Character.isUpperCase(s.charAt(i)))
                upper.add(s.charAt(i));
            else if (Character.isDigit(s.charAt(i)))
                digit.add(s.charAt(i));
            else specs.add(s.charAt(i));

            if(i>0 && s.charAt(i-1)==s.charAt(i)) return false;
        }
        if(!upper.isEmpty() && !lower.isEmpty() && !digit.isEmpty()&& !specs.isEmpty())
            return true;
      return false;
    }
}
