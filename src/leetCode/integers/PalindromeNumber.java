package leetCode.integers;

public class PalindromeNumber {

    public static boolean isPalindrome(int x){
        //if the number is a negative number
        //if the number ends with 0
        if(x<0 || (x !=0 && x%10==0))
            return false;
        int reverse=0;
        int num=x;
        while (num>reverse){
            int lastDigit=num % 10;
            reverse = reverse * 10 +lastDigit;
            num = num / 10;
        }
        return num==reverse / 10 || num ==reverse;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(1234564323));
        System.out.println(isPalindrome(223454322));
        System.out.println(isPalindrome(01233210));

    }
}


