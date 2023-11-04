package hackerrank.data_structures;

import java.util.Arrays;

public class ZigZag {

    public static void main(String[] args) {
        int[] a = {2,4,1,3,5,6,7,8,9};
        int n =9;
        findZigZagSequence(a,n);
        zigzag(a,n);
    }
    public static void findZigZagSequence(int [] a, int n){
        Arrays.sort(a);
        int mid = (n+1)/2;
        int temp = a[mid];
        a[mid] = a[n - 1];
        a[n - 1] = temp;

        int st = mid + 1;
        int ed = n - 2;
        while(st <= ed){
            temp = a[st];
            a[st] = a[ed];
            a[ed] = temp;
            st = st + 1;
            ed = ed - 1;
        }
        for(int i = 0; i < n; i++){
            if(i > 0) System.out.print(" ");
            System.out.print(a[i]);
        }
        System.out.println();
    }
    public static void zigzag(int[] a, int n){
        Arrays.sort(a);

        int mid = ((n+1)/2)-1;
        while(mid < n-1) {
            int temp = a[mid];
            a[mid] = a[n - 1];
            a[n - 1] = temp;
            mid++;
            n--;
        }
        for(int i = 0; i < n; i++){
            if(i > 0) System.out.print(" ");
            System.out.print(a[i]);
        }
        System.out.println();
    }
}
