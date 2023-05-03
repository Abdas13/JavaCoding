package arithmetic;

public class PalindromeNumbers {
    // To print the palindrome available between 0 to 100
    public static void main(String[] args){

        for (int n = 1; n <=200 ; n++) {
            int a, d=0; int newNumber=0; a=n;
            while(a>0){
                d=a%10;
                newNumber=10*newNumber+d;
                a=a/10;
            }
            if(newNumber==n){
                System.out.print(n+", ");
            }

        }
    }
}

