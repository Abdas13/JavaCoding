package javaPractice;

public class IsPalindrome {
    public static void main(String[] args) {

        String givenString="ey edip adanada pide ye";

        isPalindrome(givenString);
    }
    public static void isPalindrome(String str) {
        int counter=0;
        for (int i = 0; i <(str.length()-1)/2 ; i++) {
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                System.out.println(str+" is NOT PALINDROME");
                break;
            }else {
                counter++;
            }
        }
        if (counter==(str.length()-1)/2){
            System.out.println(str+" is PALINDROME");
        }
    }
}
