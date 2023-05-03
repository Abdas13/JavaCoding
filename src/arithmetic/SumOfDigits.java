package arithmetic;

public class SumOfDigits {
    public static void main(String[] args) {
        int n=123456789;
        int sumD=0;
        while(n>0){
            sumD=sumD+n%10;
            n=n/10;
        }
        System.out.println(sumD);
    }
}
