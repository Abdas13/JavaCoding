package arithmetic;

public class ArmstrongNumber {
    //The sum of cubes of digits must be the number itself.
    //abc=(a*a*a)+(b*b*b)+(c*c*c)
    public static void main(String[] args) {
        int number=153;
        int givenNumber=number;
        int digits=0;
        while(number>0){
            digits=(number%10)*(number%10)*(number%10)+digits;
            number=number/10;
        }
        if(givenNumber==digits){
            System.out.println(givenNumber+" is an Armstrong Number");
        }else{
            System.out.println(givenNumber+" is NOT Armstrong Number");
        }

    }
}
