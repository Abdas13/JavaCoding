package arithmetic;

public class NumberOfDigits {
    public static void main(String[] args) {
        int n=234567867;
        int counter=0;
        while(n>0) {
            n = n / 10;
            counter++;
        }
        System.out.println(counter);
    }
}
