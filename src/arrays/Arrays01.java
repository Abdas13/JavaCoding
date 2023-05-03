package arrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {

       // int[] numbers=new int[5];
       // int[] numbers= {20, 30, 40, 50, 60};
       // String[] names=new String[3];

        String[] arr=new String[3];
        arr[0]="Ali";
        arr[1]="Veli";
        arr[2]="Hami";
         System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);

        String sentence= " I love Java";
        String[] array=sentence.split("love");
        System.out.println(array.length);
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(Arrays.toString(array));

        String sentences="Hi guys. Let's go. I am ready.";
        String[] brr=sentences.split("\\.");
        System.out.println(Arrays.toString(brr));
        System.out.println(brr[0]);
        System.out.println(brr[2]);
        System.out.println(brr[1]);




    }
}
