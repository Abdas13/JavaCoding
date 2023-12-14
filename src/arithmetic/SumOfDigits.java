package arithmetic;

public class SumOfDigits {
    public static void main(String[] args) {
        int n=123456789;
//        System.out.println(sumOfDigits(n));
        int sumD=0;
        while(n>0){
            sumD=sumD+n%10;
            n=n/10;
        }
        System.out.println(sumD);

    }
    public static int sumOfDigits(int n){
        String num = ""+n;
        String[] numArr = num.split("");
        int total = 0;

        for (int i = 0; i < numArr.length; i++) {
            total += Integer.parseInt(numArr[i]);
        }
        return total;
    }
}
