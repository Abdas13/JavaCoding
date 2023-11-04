package practice;

public class IsNumberPalindrome {

    public static void main(String[] args) {

        int num = 1254321;
        System.out.println(isPalindrome(num));
    }
    public static boolean isPalindrome(int num){

        String strNum = Integer.toString(num);
        int left = 0;
        int right = strNum.length()-1;
        while(left<right){
            if(strNum.charAt(left)==strNum.charAt(right)){
                left++;
                right--;
            }else {
                return false;
            }
        }
        return true;
    }
}
