package collections.map;

import java.util.HashMap;
import java.util.Map;

public class MapAB2 {

    public static void main(String[] args) {
        Map<String, String> hmap = new HashMap<>();
        hmap.put("a","Hi");
        hmap.put("b","Hi");
        hmap.put("c","There");

        if (hmap.containsKey("a") && hmap.containsKey("b")){
            String aValue = hmap.get("a");
            String bValue = hmap.get("b");

            if (aValue==bValue){
                hmap.remove("a");
                hmap.remove("b");
            }
        }
        System.out.println(hmap);
    }
}
/*
if a and b are both in the map and have equal values, rempove them both.

Ex  mapAB2({"a": "aaa", "b": "aaa", "c": "cake"}) => {"c": "cake"}
    mapAB2({"a": "aaa", "b": "bbb"}) => {"a": "aaa", "b": "bbb"}
 */
