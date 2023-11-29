package leetCode.collections;

import java.util.HashMap;

public class RomanToInteger {
    static int[] table = new int[256];
    static {
        table['I']=1;
        table['V']=5;
        table['X']=10;
        table['L']=50;
        table['C']=100;
        table['D']=500;
        table['M']=1000;
    }
    public static void main(String[] args) {
        String str = "XXIV";
        System.out.println(romanToInt(str));
        System.out.println(romanToInteger(str));
    }
    public static int romanToInt(String str){
        int result = table[str.charAt(str.length()-1)];
        for (int i = str.length()-2; i>=0  ; i--) {
            if(table[str.charAt(i)] < table[str.charAt(i+1)]){
                result -= table[str.charAt(i)];
            }else {
                result += table[str.charAt(i)];
            }
        }
        return result;
    }
    public static int romanToInteger(String s) {
        // Create a HashMap to store the values of Roman numerals
        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
        int result = 0;
        int prevValue = 0;

        // Iterate through the Roman numeral from left to right
        for (int i = 0; i < s.length(); i++) {
            int currentValue = romanMap.get(s.charAt(i));
// If a smaller numeral appears before a larger one, subtract its value
            if (currentValue > prevValue) {
                result += currentValue - 2 * prevValue;
            } else {
                result += currentValue;
            }
            prevValue = currentValue;
        }
        return result;
    }
}
