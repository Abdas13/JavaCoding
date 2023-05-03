package arithmetic;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to find if it is odd or even");
        int n=sc.nextInt();
        if(n%2==0){
            System.out.println(n+" is even");
        }else{
            System.out.println(n+" is odd");
        }
    }
}
