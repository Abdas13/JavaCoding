package challenge;

import java.util.Scanner;

public class OperationCenter {

    public static void main(String [] args){

        Scanner scan=new Scanner(System.in);
        System.out.println("Input two numbers to start the desired operation");
        int input1=scan.nextInt();
        int input2=scan.nextInt();

        int result=add(input1, input2);

        System.out.println("Select the number of operation which you want"+
                "\n1-Check if it is Prime"+
                "\n2-Check if it is Fibonacci"+
                "\n3-Check if it is Palindrome"+
                "\n4-Get the factorial value"+
                "\n5-AreCharsOrdered how many factors has");
        int select= scan.nextInt();

        switch(select){
            case 1:
                isPrime(result);
                break;
            case 2:
                isFibonacci(result);
                break;
            case 3:
                isPalindrome(result);
                break;
            case 4:
                findFactorial(result);
                break;
            case 5:
                numberOfFactors(result);
                break;

        }

    }

    private static int add(int input1, int input2) {
        return input1+input2;

    }
    private static void isPrime(int result) {
        boolean flag=true;
        if (result<2){
            System.out.println("The sum of two numbers you entered :"+result);
            System.out.println(result+" is NOT prime");
        }else {
            for (int i = 2; i <result ; i++) {
                if (result%i==0){
                    flag=false;
                }

            }
            if(flag){
                System.out.println("The sum of two numbers you entered :"+result);
                System.out.println(result+" is prime");
            }else {
                System.out.println("The sum of two numbers you entered :"+result);
                System.out.println(result+" is NOT prime");
            }
        }

    }

    private static void isFibonacci(int result) {
        int f1=0;
        int f2=1;
        int temp=0;

        if (result<0){
            System.out.println("The sum of two numbers you entered :"+result);
            System.out.println(result+" is negative, so it is NOT a Fibonacci number");
        }else if(result==0 || result==1){
            System.out.println("The sum of two numbers you entered :"+result);
            System.out.println(result+" is a Fibonacci number");
        }else{
            boolean flag=false;
            while (result>=temp){
                temp=f1+f2;
                f2=f1;
                f1=temp;
                if (temp==result){
                    System.out.println("The sum of two numbers you entered :"+result);
                    System.out.println(result+" is Fibonacci number");
                    flag=true;
                }
            }
            if(!flag){
                System.out.println("The sum of two numbers you entered :"+result);
                System.out.println(result+" is NOT a Fibonacci number");
            }
        }
    }

    private static void findFactorial(int result) {
        int factorial=1;
        if (result<0 || result>10){
            System.out.println("The sum of two numbers you entered :"+result);
            System.out.println("The factorial for the "+result+ " can not be calculated");
        }else if (result==0 || result==1){
            System.out.println("The sum of two numbers you entered :"+result);
            System.out.println("The factorial of "+result+ " is 1");
        }else {
            for (int i = 1; i <=result; i++) {
                factorial*=i;
            }
            System.out.println("The sum of two numbers you entered :"+result);
            System.out.println("The factorial of "+result+ " is "+factorial);
        }

    }
    private static void numberOfFactors( int result) {

        int numOfFactors=2;
        for (int i = 2; i <=result ; i++) {
            if (result%i==0){
                numOfFactors+=2;

            }

        }
        System.out.println("The sum of two numbers you entered :"+result);
        System.out.println("The number of factors of "+result+ " is "+numOfFactors);
    }
    private static void isPalindrome(int result) {
        String originalResult=result+"";
        String reverse="";
        for (int i = originalResult.length()-1; i >=0 ; i--) {
            reverse+=originalResult.charAt(i);
        }
        if(originalResult.equals(reverse)){
            System.out.println("The sum of two numbers you entered :"+result);
            System.out.println("The "+result+ " is a Palindrome number");
        }else {
            System.out.println("The sum of two numbers you entered :"+result);
            System.out.println("The  "+result+ " is NOT a Palindrome number");
        }
    }
}
