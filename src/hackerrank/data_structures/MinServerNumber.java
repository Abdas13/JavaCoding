package hackerrank.data_structures;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class MinServerNumber {
    public static void main(String[] args) {
        /*
        Find the least length of subarray which has sum equals expected_load
         */
        List<Integer> server = Arrays.asList(1,1,2,4,4);
        int expected_load = 10;
        System.out.println(getMinServers(expected_load, server));
    }
    public static int getMinServers(int expected_load, List<Integer> server){
        Collections.reverse(server);
        int n = server.size();
        int[] prefix = new int[n];
        prefix[0]=server.get(0);
        for (int i = 1; i < n ; i++) {             // [4, 4, 2, 1, 1]
            prefix[i]= prefix[i-1]+server.get(i);  // [4, 8, 10, 11, 12]
            if(prefix[i]==expected_load)
                return i+1;
            else if (prefix[i]>expected_load) {
                prefix[i]=prefix[i]-server.get(i);
            }
        }
        return -1;
    }
}
