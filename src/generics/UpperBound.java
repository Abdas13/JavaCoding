package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UpperBound {

    public static double sumAll(List<? extends Number>list){
        double sum=0;
        for (Number n: list)
            sum += n.doubleValue();
        return sum;
    }

    public static void showAll(List<? extends Number>list){
        for(Number n:list)
            System.out.println(n);

    }
    public static void main(String[] args) {
//        List<? extends Number>l1=new ArrayList<>();
//        List<? extends Number>l2=new ArrayList<>();
//        List<? extends Number>l3=new ArrayList<>();

        showAll(Arrays.asList(1.2, 3.67, 4.45));

        System.out.println(sumAll(Arrays.asList(5, 3.45, 4.56f, 25)));

    }
}
