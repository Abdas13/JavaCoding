package practice;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a string to get the reverse");
        String str= scan.next();
        System.out.println(reverseString(str));
    }

    public static String reverseString(String str) {
        String rev="";
        char[] arr=str.toCharArray();
        for(int i=arr.length-1; i>=0;i--){
            rev=rev+arr[i];

        }
        return rev;
    }
}
