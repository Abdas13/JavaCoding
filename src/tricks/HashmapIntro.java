package tricks;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class HashmapIntro {
    public static void main(String[] args) {
        Map<String, Integer> ages = new HashMap<>();

        ages.put("Ali", 25);
        ages.put("Veli", 27);
        ages.put("Mali", 29);
        ages.put("Sali", 30);

        Stream.of(ages)
                .forEach(System.out::println);

        ages.put("Ali", 26);
        ages.putIfAbsent("Hami", 13);
        ages.putIfAbsent("Mali", 35);

        ages.replace("Veli", 27, 33);
        ages.replace("Sali", 37, 66);

        System.out.println(ages);

        ages.remove("Mali");
        System.out.println(ages);

        for(String key: ages.keySet()){
            System.out.println(key + " : "+ages.get(key));
        }

        for (Map.Entry<String, Integer> entry : ages.entrySet()){
            System.out.println(entry.getKey()+ " : "+entry.getValue());
        }
        ages.entrySet().stream().forEach(pair ->
                System.out.println(pair.getKey()+ ": "+pair.getValue()));

    }
}
