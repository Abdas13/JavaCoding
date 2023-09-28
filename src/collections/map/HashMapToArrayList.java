package collections.map;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapToArrayList {
    public static void main(String[] args) {
        HashMap<String,String>performanceMap=new HashMap<String,String>();
        //Add elements
        performanceMap.put("John Sen","Average");
        performanceMap.put("Jiger Sin","Very Good");
        performanceMap.put("Ne Istersin","Very Bad");
        performanceMap.put("Karpuz Mu","Very Good");
        performanceMap.put("Shimdi Bitti","Bad");
        //Get set of keys
        Set<String>keySet=performanceMap.keySet();
        //create list of keys
        ArrayList<String>listOfKeys=new ArrayList<>(keySet);
        System.out.println("ArrayList of Keys: ");

        for (String key:listOfKeys) {
            System.out.println(key);
        }
        //get collection of values
        Collection<String>values= performanceMap.values();
        ArrayList<String>listOfValues=new ArrayList<>(values);
        System.out.println("ArrayList of values: ");

        for (String value:listOfValues) {
            System.out.println(value);
        }
     //get the set of entries
        Set<Entry<String,String>>entrySet=performanceMap.entrySet();
        //create Arraylist of Entry Objects
        ArrayList<Entry<String,String>>listOfEntry=new ArrayList<Entry<String,String>>(entrySet);
        System.out.println("ArrayList of Key-Values: ");
        for (Entry<String,String>entry:listOfEntry) {
            System.out.println(entry.getKey()+": "+entry.getValue());

        }
    }
}
