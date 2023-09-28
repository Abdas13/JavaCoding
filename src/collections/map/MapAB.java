package collections.map;

import java.util.HashMap;
import java.util.Map;

public class MapAB {

    public static void main(String[] args) {
        //input = { "a": "Hi", "b", "There"} => {"a": "Hi","ab":"HiThere", "b": "There

        Map<String,String> hmap = new HashMap<>();
        hmap.put("a", "Hi");
        hmap.put("b","There");

        if (hmap.containsKey("a")&& hmap.containsKey("b")){
            hmap.put("ab", hmap.get("a")+hmap.get("b"));
        }
        System.out.println(hmap);

    }
}
