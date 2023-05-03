package arithmetic;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number to check if it is a palindrome");
        int number=scan.nextInt();
        int givenNumber=number;
        int reverse=0;
        while(number>0){
            int n=number%10;
            number=number/10;
            reverse=10*reverse+n;
        }
        if(givenNumber==reverse){
            System.out.println(givenNumber+" is a palindrome number");
        }else{
            System.out.println(givenNumber+" is NOT a palindrome number");
        }

    }
}
