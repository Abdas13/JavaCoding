package leetCode.arrays;

import java.util.HashMap;
import java.util.Map;

public class TripletCountIBM {
    public static void main(String[] args) {
        /*
        An int array (stock) and an int (d) are given.
        The stocks are wanted to buy in triplets that the sum of
        the cost for three days is divisible by d. the indices of
        triples (i,j,k) will be i<j<k and
        the sum = stock[i] + stock[j] + stock[k]
        Example:
        int[] stock = {3,3,4,7,8};
        int d = 5;
        indices 1,2,3 => sum = 3+3+4 = 10 is divisible by 5
        indices 1,3,5 => sum = 3+4+8 = 15 is divisible by 5
        indices 2,3,4 => sum = 3+4+8 = 15 is divisible by 5
        output will be 3 (3 alternatives)
         */
        int[] stock = {3,3,4,7,8,15};
        int d = 5;
        System.out.println(getTripletCount(stock, d));
        System.out.println(getTripletCount2(stock, d));
    }
    public static int getTripletCount(int[] stock, int d){

        int count = 0;
        for (int i = 0; i < stock.length-2; i++) {
            for (int j = i+1; j < stock.length-1 ; j++) {
                for (int k = j+1; k <stock.length ; k++) {
                    if ((stock[i]+stock[j]+stock[k])%d==0){
                        count++;
                    }
                }
            }
        }
        return count;
    }
    public static int getTripletCount2(int[] stock, int d){
        Map<Integer, Integer> hm = new HashMap<>();
        int count =0;
        for (int i = 0; i < stock.length-2; i++) {
            int t = stock[i]%d;

           }
        return count;
    }
}
