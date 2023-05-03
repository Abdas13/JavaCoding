package javaPractice;

public class RecursiveMethods {
    public static void main(String[] args) {
        
        int input = 5;
        int result = add(input);
        System.out.println(result);

        String input2="ey edip adanada pide ye";
        boolean result2 = checkPalindrome(input2);
        System.out.println(result2);

    }
    private static boolean checkPalindrome(String input2) {
        if(input2.length()==0 || input2.length()==1){
            return true;
        }else {
            if (input2.substring(0,1).equalsIgnoreCase(input2.substring(input2.length()-1))){
                return checkPalindrome(input2.substring(1,(input2.length()-1)));
            }else {
                return false;
            }
        }

    }

    private static int add(int input) {
        if(input==1){
            return 1;
        }else {
            return input+add(input-1);
        }
    }

}
