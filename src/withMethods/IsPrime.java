package withMethods;

public class IsPrime {

    public static void main(String [] args ) {
        int num=25;
        for(int i=2; i<=num;i++){
            if(isPrime(i))
                System.out.println(i);

        }
    }
    public static boolean isPrime(int number){
        for(int i=2; i<number; i++)
            if(number%i==0){
                return false;
            }
        return true;
    }
}
