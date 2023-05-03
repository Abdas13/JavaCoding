package arithmetic;

import java.util.Arrays;
import java.util.Collections;

public class SortArray {
    public static void main(String[] args) {
        int arr[] = {9,15,4,22,4,33,6,7,7,8};
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i+1; j < arr.length; j++) {
//                int temp;
//                if(arr[i]>arr[j]){
//                    temp=arr[j];
//                    arr[j]=arr[i];
//                    arr[i]=temp;
//                }
//            }
//            System.out.print(arr[i]+"**");
//        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("---------------");

        Integer[] array=new Integer[]{2,5,-4,3,14};
        Arrays.sort(array);
//        Arrays.sort(array, Collections.reverseOrder());
        System.out.println(Arrays.toString(array));


    }
}
