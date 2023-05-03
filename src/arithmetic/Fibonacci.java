package arithmetic;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    public static void main(String[] args) {
        //the sequence that sum of two consecutive numbers gives the next number
       List<Integer> list=new ArrayList<>();
       int n1=0;
       int n2=1;
        System.out.print(n1+","+n2+",");
       do{
           int n3=n1+n2;
           n1=n2;
           n2=n3;
           if(n3>100)
               break;
           System.out.print(n3+", ");
       }while(true);



    }
}
