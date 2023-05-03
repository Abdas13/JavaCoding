package practice;

public class Fibonacci {
    public static void main(String[] args) {
        printFibonacciNumbers(10);
    }

    static void printFibonacciNumbers(int n) {
        int f1=0;
        int f2=1;
        int i;

        if(n<1){
            return;
        }
        System.out.println(0);
        for (i=1; i<=n; i++){
            System.out.println(f2+" ");
            int next=f1+f2;
            f1=f2;
            f2=next;

        }
    }
}
