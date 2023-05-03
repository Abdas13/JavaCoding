package collections;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapDep {

    public static void main(String[] args) {
//          [A->C]
//          [B-> C, E]
//          [C->F, B, D]
//          [D-> B]
        getDependant("A",1);
        System.out.println(dependants());
    }

    public static Map<String, List<String>> dependants(){
        Map<String, List<String>> dep= new HashMap<>();
        dep.put("A",List.of("C"));
        dep.put("B",List.of("C", "E"));
        dep.put("C",List.of("F", "B", "D"));
        dep.put("D", List.of("B"));
        return dep;
    }
    public static void getDependant(String str, int a){
        for (int i=0; i< dependants().get(str).size(); i++){
             if (dependants().containsKey(str)) {
                 System.out.println(dependants().get(str).get(i) + " " + (++a));
             }


//             str=dependants().get(str).get(i);
        }
        a++;




    }

            // getDependancy(A, 1)
    /*
    C 2
    F 3
    D 3
    E 3
    B 4

     */
}
