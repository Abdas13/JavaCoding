package javaPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DivicibleBy3And5 {
    public static void main(String[] args) {
        for (int i = 1; i <=30 ; i++) {
            if(i%3==0 && i%5!=0){
                System.out.print("FIN"+",");
            }else  if(i%5==0 && i%3!=0){
                System.out.print("RA"+",");
            }else if(i%3==0 && i%5==0){
                System.out.print("FINRA"+",");
            }else {
                System.out.print(i+",");
            }
        }
    }
}
