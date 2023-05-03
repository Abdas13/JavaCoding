package leetCode.integers;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class SortTwoArrays {
    public static void main(String[] args) {
        int[] arr = {12,13,24,33,56};
        int[] brr = {17,23,28,58,73,75};
        System.out.print(sortTwoArrays(arr, brr));
        System.out.println();

//        System.err.println(Arrays.toString(mergeArrs(arr, brr)));
//
//        mergeArraysSorted(arr, arr.length, brr, brr.length);
    }
    public static List<Integer> sortTwoArrays(int[] arr, int[] brr){
        List<Integer>list=new ArrayList<>();
        for (int k : arr) {
            list.add(k);
        }
        for (int k : brr) {
            list.add(k);
        }
        for (int i = 0; i < list.size() ; i++) {
            for (int j = 0; j < list.size(); j++) {
            int temp=0;
            if(list.get(i) < list.get(j)) {
                temp = list.get(i);
                list.set(i, list.get(j));
                list.set(j, temp);
            }
            }
        }
        return list;
    }
    public static void mergeArraysSorted(int[] nums1, int m, int[] nums2, int n){
//        int p1 = m-1;
//        int p2 = n-1;
//        for (int i = nums1.length-1; i >=0 ; i--) {
//            int valAtP1 = p1 >=0 ? nums1[p1] : Integer.MIN_VALUE;
//            int valAtP2 = p2 >=0 ? nums2[p2] : Integer.MIN_VALUE;
//            if (valAtP1 > valAtP2){6.
//                nums1[i] = valAtP1;
//                p1--;
//            }else {
//                nums1[i] = valAtP2;
//                p2--;
//            }
//        }
//        System.out.println(Arrays.toString(nums1));
    }
    public static int[] mergeArrs(int[] num1, int[] num2) {
        int[] mergedArray = new int[num1.length + num2.length];
        int mergeArrayIndex = 0;
        int counter = 0;

        for (int i = 0; i < num1.length; i++) {
            for (int j = counter; j < num2.length; j++) {
                    if (num1[i] < num2[j]) {
                        mergedArray[mergeArrayIndex++] = num1[i];
                        counter = j;
                        break;
                    } else
                        mergedArray[mergeArrayIndex++] = num2[j];
            }
        }
        return mergedArray;
    }
}
