
package practice;

public class FactorialRecursively {
    public static void main(String[] args) {
        System.out.println(factorialReursively(5));
        System.out.println(factorialReursively(0));
        System.out.println(factorialReursively(1));
        System.out.println(factorial(6));
        System.out.println(factorial(0));

    }
    public static int factorialReursively(int num){

        if(num==0 || num==1)
            return 1;
        else
            return num*factorialReursively(num-1);
    }
    public static int factorial(int num){
        if(num==0)
            return 1;
       int factorial=1;
        for (int i = 1; i <= num ; i++) {
            factorial=factorial*i;
        }
        return factorial;

    }
}
