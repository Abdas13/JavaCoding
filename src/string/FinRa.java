package string;

import java.util.Arrays;

public class FinRa {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(printFinRa(1, 100)));
    }
    public static String[] printFinRa(int start, int end){

        String[] str = new String[100];
        for (int i = start; i <= end; i++) {
            if(i%15==0) str[i-1]="FINRA";
            else if (i%3==0) str[i-1]="FIN";
            else if (i%5==0) str[i-1]="RA";
            else str[i-1]=Integer.toString(i);
        }
        return str;
    }

}
