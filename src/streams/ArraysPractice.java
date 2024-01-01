package streams;

import java.util.*;
import java.util.stream.Collectors;

public class ArraysPractice {
    public static void main(String[] args) {
        int[] nums = {2,3,3,5,7,4,5,3};
        List<Integer> l2 = List.of(2,3,5,5,7,4,5,3,7);

        int  sumOfSquaresOfEvens = Arrays.stream(nums).distinct().filter(t-> t%2==0).map(k-> k*k).reduce(0, Integer::sum);

        System.out.println(sumOfSquaresOfEvens);

        int productOfOdds = Arrays.stream(nums).distinct().filter(t-> t%2!=0).map(k-> k-2).reduce(1, (m,n)->m*n);
        System.out.println(productOfOdds);

        int[] l1 = Arrays.stream(nums).filter(t-> t*2<10).map(k-> k*k).sorted().toArray();
        System.out.println(Arrays.toString(l1));

        l2.stream().filter(t-> t%2!=0).map(m-> m*2).collect(Collectors.toList()).forEach(System.out::println);

        int maxNum = l2.stream().filter(t-> t<6).map(k-> k*k).reduce(Integer.MIN_VALUE, (m,n)-> m<n ? n : m);
        System.out.println(" max num is :"+maxNum);

        List<Integer> l22 = l2.stream().filter(n-> n>2).map(k-> k*k).limit(4).collect(Collectors.toList());

        System.out.println(l22);
    }
}
