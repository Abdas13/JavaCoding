package leetCode.integers;

public class FactorialTrailingZeros {
    public static int trailingZeros(int n){
        // to find the number of zeros at the right side of a factorial
        int count=0;
        for (int i=5; i<=n; i=i * 5){
            count = count + n/i;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(trailingZeros(50));
        System.out.println(trailingZeros(10));
    }
}
