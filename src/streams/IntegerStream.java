package streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntegerStream {
    public static void main(String[] args) throws IOException {

        // range and print
        IntStream.range(1,10)
                .forEach(System.out::print);
        System.out.println();

        // range, skip and print
        IntStream
                .range(1,10)
                .skip(5)
                .forEach(x-> System.out.println(x));
        System.out.println();

        // range then sum
        System.out.println(IntStream
                .range(1, 10)
                .sum());
        System.out.println();

        // sort String and print first
        Stream.of("dd","aa","cc","bb")
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);
        // filter , sort
        String[] names = {"Ali", "Adam", "John", "Jack"};
        Arrays.stream(names)
                .filter(x-> x.startsWith("J"))
                .sorted()
                .forEach(System.out::println);

        // map, average
        Arrays.stream(new int[] {2,4,6,8,10})
                .map(x-> x*x)
                .average()
                .ifPresent(System.out::println);

        // List filter, sort
        List<String> people = Arrays.asList("Ali", "Adam", "John","Julia", "Jack");

        people
                .stream()
                .map(String::toLowerCase)
                .filter(x-> x.startsWith("j"))
                .filter(y->y.startsWith("h",2))
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);


        double total = Stream.of(2.5, 4.8, 3.9)
                .reduce(0.0, (Double a, Double b)-> a+b);
        System.out.println("Total : "+total);

        double total2 = Stream.of(2.5, 4.8, 3.9)
                .reduce(0.0, Double::sum);
        System.out.println("Total : "+total2);

        IntSummaryStatistics summaryStatistics = IntStream.of(5,7,9,11,1,3,13)
                .summaryStatistics();
        System.out.println(summaryStatistics);

        Stream<String> bands = Files.lines(Paths.get("src/streams/bands.txt"));

        bands
                .sorted()
                .filter(x-> x.length()>13)
                .forEach(System.out::println);
        bands.close();

        List<String> bands2 = Files.lines(Paths.get("src/streams/bands.txt"))
                .filter(x-> x.contains("jit"))
                .collect(Collectors.toList());
        bands2.forEach(x-> System.out.println(x));

        Stream<String> rows1 = Files.lines(Paths.get("src/streams/data.txt"));

        int rowCount = (int)rows1
                .map(x-> x.split(","))
                .filter(x-> x.length==3)
                .count();
        System.out.println(rowCount +" rows.");

        Stream<String> rows2 = Files.lines(Paths.get("src/streams/data.txt"));
        rows2
                .map(x->x.split(","))
                .filter(x-> x.length==3)
                .filter(x->Integer.parseInt(x[1]) > 15)
                .forEach(x->System.out.println(x[0] +" "+x[1]+" "+x[2]));

        Stream<String> rows3 = Files.lines(Paths.get("src/streams/data.txt"));

        Map<String, Integer> hmap = new HashMap<>();

        hmap = rows3
                .map(x-> x.split(","))
                .filter(x->x.length==3)
                .filter(x->Integer.parseInt(x[1])>15)
                .collect(Collectors.toMap(x->x[0],
                        x->Integer.parseInt(x[1])));
        rows3.close();
        for(String key: hmap.keySet()){
            System.out.println(key + " "+ hmap.get(key));
        }
    }

}
