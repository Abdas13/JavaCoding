package arithmetic;

import java.util.Arrays;
import java.util.Collections;

public class Arrays1 {
    public static void main(String[] args) {
//        int arr2 [] = {2,4,6,8,10};
//        int sum = Arrays.stream(arr2).sum();
//        System.out.println("ikinci method " + sum);
        // verilen bir arrayin buyukten kucuge siralanan bir method yaziniz.
        int arr[] = {9,15,4,22,4,33,6,7,7,8};

        arr = arrayiSirala(arr);

        System.out.println("Duz siralanmis hali " + Arrays.toString(arr));
        arr = arrayiTerstenSirala(arr);
        System.out.println("tersten siralanmis hali " + Arrays.toString(arr));

        //buyukten kucuge yazdirmak.
        //Collecitonslari kullandigim icin non-primitive data type kullandim zorunlu
        Integer [] arr2 = new Integer[]{1,5,0,-2};
        Arrays.sort(arr2, Collections.reverseOrder());
        System.out.println("Buyukten kucuge " + Arrays.toString(arr2));

        //kucukten buyuge siralamak icin
        int [] arr3 = new int[]{1,5,0,-2};
        Arrays.sort(arr3);
        System.out.println("Kucukten buyuge  = " + Arrays.toString(arr3));


    }

    private static int[] arrayiTerstenSirala(int[] arr) {
        int [] temp = new int[arr.length];//eski arr ile ayni uzunlukta bir arr olustur
        for (int i = 0; i < temp.length; i++) {
            temp[i] = arr[arr.length-1-i];
        }
        return temp;
    }

    public static int [] arrayiSirala(int[] arr) {
        //oncelikle array'i buyukren kucuge siralamamiz gerekir.
        Arrays.sort(arr);
        return  arr;
    }
}
