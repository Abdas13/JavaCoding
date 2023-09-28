package collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashmap01 {
    public static void main(String[] args) {
        Map<Integer, String> map=new HashMap<>();
        map.put(3,"aa");
        map.put(1,"bb");
        map.put(15,"yy");
        map.put(8,"mm");
        map.put(4,"pp");

//        for (Integer key: map.keySet()) {
//            System.out.println(map.get(key));
//        }

        Set<Integer> keys = map.keySet();
        System.out.println(keys);
        for (Map.Entry<Integer,String>entry: map.entrySet()) {
            System.out.println(entry.getKey()+"==>"+entry.getValue());
            
        }


    }


}
