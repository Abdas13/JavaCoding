package challenge;

import java.util.HashSet;
import java.util.Set;

public class UniqueElements {
    public static void main(String[] args) {

        String name="abdurrahmanas";
        String unique="";

//        for (int i=0; i<name.length(); i++) {
//            String letter = String.valueOf(name.charAt(i));
//            if (!unique.contains(letter)) {
//                unique = unique + letter;
//            }
//        }
        Set<Character> set1=new HashSet<>();
        for(int i=0;i<name.length();i++){
            set1.add(name.charAt(i));

        }
//        System.out.println(unique);
        System.out.println(set1);
    }
}
