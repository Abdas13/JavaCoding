package arithmetic;

public class IsPrime {
    public static void main(String[] args) {
        System.out.println(isPrime(25));
        System.out.println(isPrime(97));
    }
    public static boolean isPrime(int n){
        for (int i = 2; i*i <= n ; i++) { // loop goes until square root
            if (n%i==0) return false;
        }
        return true;
    }
}
