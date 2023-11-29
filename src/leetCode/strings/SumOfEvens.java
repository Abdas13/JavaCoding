package leetCode.strings;

import java.util.Arrays;

public class SumOfEvens {
    public static void main(String[] args) {
        System.out.println(sumOFEvens("3gh%4, 8&gf6, rt#4"));
    }
    public static int sumOFEvens(String str){
        String[] digits = str.replaceAll("[^0-9]", "").split("");
        int sum = 0;
        for (int i = 0; i < digits.length; i++) {
            if(Integer.parseInt(digits[i])%2==0){
                sum +=Integer.parseInt(digits[i]);
            }
        }
        return sum;
    }
}
