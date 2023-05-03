package arithmetic;

import java.util.ArrayList;
import java.util.List;

public class ArmstongNumbers {
    //Print the amstrong number available between 0 to 1000
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
//
//        for (int n = 1; n <=1000 ; n++) {
//            int sumD=0;
//            int firstN=n;
//            int j=0;
//            while(firstN>0) {
//                sumD = sumD + (firstN % 10) * (firstN % 10) * (firstN % 10);
//                firstN = firstN/10;
//            }
//            if(n==sumD){
//                list.add(sumD);
//            }
//            }
//        System.out.println(list);

        int mod=0;
        for (int num = 1; num <1000 ; num++) {
            int sum=0;
            int givenNum=num;
            while (givenNum>0){
                sum=sum+(givenNum%10)*(givenNum%10)*(givenNum%10);
                givenNum=givenNum/10;
            }
            if (num==sum){
                list.add(num);
            }
        }

        System.out.println(list);

        }
    }


