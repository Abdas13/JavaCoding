package hackerrank.data_structures;

import java.util.List;

public class MinCosIBM {
    /*  n=> number of days, k=> k computing cores per day for n days
    first two elements are representing the days that the price is available.
    third is the number of cores available each day, the fourth is the cost for one core per day

     */
    public static void main(String[] args) {

    }
    public static long getMinCost(int n, int k, List<List<Integer>>plans){

        int minSum = Integer.MAX_VALUE;

        for (int i = 0; i < plans.size(); i++) {
            int minCost = Integer.MAX_VALUE;
            while(minCost>plans.get(i).get(3)){
                minCost = plans.get(i).get(3);
            }

        }
        return 0;
    }
}
