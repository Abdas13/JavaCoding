package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayArrayListConvert {
    public static void main(String[] args) {
        String [] arr={"Java","Python"};
        List list1= Arrays.asList(arr);
        System.out.println(list1);

        ArrayList<String>list2=new ArrayList<>();
        list2.add("A");
        list2.add("B");
        list2.add("C");
        list2.add("D");

        Object [] array=list2.toArray();
        System.out.println(Arrays.toString(array));




    }
}
