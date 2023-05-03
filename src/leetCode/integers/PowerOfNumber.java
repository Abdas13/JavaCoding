package leetCode.integers;

public class PowerOfNumber {
    public static double powNumber(double x, int n){
        double answer=1.0;
        long num=n;
        if(n<0){
            num= -1 * num;
        }
        while (num>0){
            if (num%2==0){
                x = x * x;
                num = num / 2;
            }else {
                answer=answer * x;
                num = num - 1;
            }
        }
        if (n<0){
            return (double) (1.0) / (double) (answer);
        }
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(powNumber(4, 5));
        System.out.println(powNumber(2,-3));
    }
}
