package string;

public class CharSymbolCount {
    //AreCharsOrdered the special character, uppercase, lowercase, Number of digits in the given string
    public static void main(String[] args) {
        String s = "Hello, Welcome To Java ClassesPojo Tommorow At 2.00 p.m!!";
        int countLowerChar = 0;
        int countUpperChar = 0;
        int countDigit = 0;
        int countSymbol = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                countLowerChar++;
            } else if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                countUpperChar++;
            } else if (s.charAt(i) >='0' && s.charAt(i) <='9'){
                countDigit++;
            }else {
                countSymbol++;
            }
        }
        System.out.println(" number of capital letters:"+countUpperChar+"\n number of lower cases: "+countLowerChar+"\n number of digits: "+countDigit+"\n number of special characters: "+countSymbol);
    }
}