package arithmetic;

import java.util.Scanner;

public class ReverseOfNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a multiple-digit number to find its' reverse");
        int number=sc.nextInt();
        int reverse=0;
        while(number>0){
            int n=number%10;
            number=number/10;
            reverse=10*reverse+ n;
        }
        System.out.println(reverse);

    }
}
