package string;

import java.util.Locale;
import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a string to check if it is palindrome: ");
        String word=scan.next().toLowerCase(Locale.ROOT);
        String reverseOfWord="";
        for (int i = word.length()-1; i >=0 ; i--) {
            reverseOfWord=reverseOfWord+word.charAt(i);
        }
        if (word.equals(reverseOfWord)){
            System.out.println("given string is Palindrome");
        }else{
            System.out.println("given string is NOT Palindrome");
        }
    }
}
