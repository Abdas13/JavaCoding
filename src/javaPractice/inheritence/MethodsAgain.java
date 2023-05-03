package javaPractice.inheritence;

public class MethodsAgain {
    public static void main(String[] args) {



    }
    public static String reversewithFor(String str){
        String rev="";
        for (int i =str.length()-1 ; i >=0 ; i--) {
            rev=rev+str.charAt(i);
        }
        return rev;
    }
    public static boolean isPrime(int number){
        if(number<=1){
            return false;
        }
        for (int i = 2; i <number ; i++) {
            if(number%i==0){
                return false;
            }
        }
        return true;
    }


}
