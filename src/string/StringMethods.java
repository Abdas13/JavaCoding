package string;

import java.util.*;

public class StringMethods {
    public static void main(String[] args) {

        String name2="ABDURRAHMAN";
        String lastname2="aS";
        //?

        String name= "Abdurrahman As";

        String subs=name.substring(3,7);
        System.out.println(subs);

        String conc=name.concat(" benim");
        System.out.println(conc);

        System.out.println(conc.charAt(3));

        System.out.println(conc.indexOf('h'));

        String[] newName=name.toLowerCase().replace(" ","").split("");

        System.out.println(Arrays.toString(newName));//[a, b, d, u, r, r, a, h, m, a, n, a, s]

        Set<String > set=new HashSet<>();
        for (String each:newName) {
            set.add(each);

        }
        List<String> list=new ArrayList<>();
        for (String eachEl:newName) {
            list.add(eachEl);

        }
        System.out.println("set mode "+set);
        System.out.println("list mode "+list);
        List<String> list1=new ArrayList<>();

        for (int i = 0; i < list.size() ; i++) {
            if(!list1.contains(list.get(i))){
                list1.add(list.get(i));
            }
        }
        System.out.println("list with unique elements "+list1);
    }
}
