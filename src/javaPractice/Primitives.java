package javaPractice;

public class Primitives {
    public static void main(String[] args) {

        System.out.println(perfectSquare(5,7));

        System.out.println(sum(20,10));

        sum2(20,30);
    }

    public static long sum(long a, int b){
        return  a + b;
    }
    public static void sum2(int a, long b){
        System.out.println(a+b);
    }
    public static double perfectSquare(double a, int b){
        return (a*a+b*b+2*a*b);
    }

}
