package hackerrank.data_structures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NewYearChaos {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(2,1,3,4,5));
    }
    public static void minimumBribes(List<Integer> q) {
        // Write your code here
        int[] a = new int[q.size()];
        for (int i = 0; i < a.length; i++) {
            a[i] = q.get(i);
        }
        int count = 0;
        for (int i = 0; i < a.length - 1; i++) {
            int n = Math.max(Math.abs(a[i] - i), 0);
            if (n > 3) {
                System.out.println(n - 1);
                System.out.println("Too caotic");
            } else if (a[i] > a[i + 1]) {
                for (int j = 0; j < a.length - 1; j++) {
                    swap(a[j], a[j + 1]);
                    count++;
                }
            }
            if (count > 2) {
                System.out.println(count);
                System.out.println("Too caotic");
            } else {
                System.out.println(count);
            }

        }
    }

    private static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

}
