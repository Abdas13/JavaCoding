import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Maps {
    public static void main(String[] args) {

        Map<Integer, String> map=new TreeMap<>(Comparator.reverseOrder());
        map.put(5,"aa");
        map.put(3,"bb");
        map.put(15,"cc");
        map.put(9,"dd");
        map.put(11,"ee");

        for(Map.Entry<Integer,String>entry : map.entrySet())
            System.out.println("Key is: "+entry.getKey()+" *** "+"Value is: "+entry.getValue());
    }
}
