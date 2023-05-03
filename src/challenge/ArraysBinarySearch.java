package challenge;

import java.util.Arrays;

public class ArraysBinarySearch {
    public static void main(String[] args) {
        int random[]={16, -41, 112, 10, -110};
        Arrays.sort(random);

        int x =10;
        int y= Arrays.binarySearch(random, x);
        System.out.println(y);
    }
}
