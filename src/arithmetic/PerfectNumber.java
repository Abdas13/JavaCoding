package arithmetic;

public class PerfectNumber {
    public static void main(String[] args) {

        int number=6;
        boolean result=checkPerfectNumber(number);
        System.out.println(result);
    }

    private static boolean checkPerfectNumber(int number) {
        int sum=0;

        for(int i=1; i<=number/2;i++){
            if(number%i==0){
                sum+=i;
            }
        }
        boolean result=sum==number;
        return result;
    }
}
