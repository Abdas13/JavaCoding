package challenge;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int num=153;
        int digit;
        int originalNum=num;
        int sum=0;
        while(num>0){
            digit=num%10;
            num=num/10;
            sum=sum+digit*digit*digit;
        }
        if(sum==originalNum) {
            System.out.println("It is armstrong");
        }
        else {
            System.out.println("It is not armstrong");
        }
    }
}
