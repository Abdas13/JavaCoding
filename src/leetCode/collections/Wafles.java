package leetCode.collections;

import java.util.Arrays;

public class Wafles {
/*
Example:

Input: [8,4,6,5,10,5,3,7]     [3,4,5,5,6,7,10]



Expected output: 4

Explanation:

There are 8 waffles left. You can give 1 waffle to guests with 5 waffles on their plates,
 2 waffles to guest with 4 waffles and 4 waffles to guest with 3 waffles.
 That way you obtain the following array [6,6,6,10,6,7,7].

 */
    public static void main(String[] args) {
        int[] plates ={8,4,6,5,10,5,3,7};     // [10,7,6,6,6,6,6]
        System.out.println(minDif(plates));
    }
    public static int minDif(int[] plates){
        int[] remainGuests = new int[plates.length-1];
        int total;
        for (int i = 1; i < plates.length ; i++) {
            remainGuests[i-1]=plates[i];
        }
        Arrays.sort(remainGuests);  // sort the remains [3,4,5,5,6,7,10]
        total = Arrays.stream(plates).sum();  // 48
        double avg = (double) total / (remainGuests.length); // the required average  6.85
        int counter = 0; // the number of remainGuests greater than avg
        for (Integer moreThanAvg:remainGuests ) {
            if (moreThanAvg > avg) {
                total -= moreThanAvg;  // 48-17=31
                counter++;
            }
        }
        int newAvg = total / (remainGuests.length-counter); // 31 / 5 =6.2
        //newAvg => remain plates should be shared using this avg,
        // also it is the least number of waffles in a plate
        return remainGuests[remainGuests.length-1]-newAvg;
    }
}
