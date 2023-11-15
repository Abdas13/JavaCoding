package tricks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ListToArray {

    public static void main(String[] args) {
        String[] strs = {"Toyota", "Honda", "Ford", "BMW"};
        System.out.println(Arrays.toString(strs));
        for (String str: strs){
            System.out.print(str+", ");
        }
        System.out.println();

        Stream.of(strs)
                .forEach(System.out::println);

        // convert to list
        List<String> arrList1 = new ArrayList<>(Arrays.asList(strs));
        System.out.println("arrayList1 : "+ arrList1);

        List<String>arrList2 = new ArrayList<>(List.of(strs));
        System.out.println("arrayList2 : "+ arrList2);

        // convert back to array
        String[] strs2 = arrList1.toArray(new String[0]);

        Stream.of(strs2)
                .forEach(System.out::println);

    }
}
