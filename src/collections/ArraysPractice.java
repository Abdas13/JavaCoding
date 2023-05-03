package collections;

import java.util.*;

public class ArraysPractice {
    public static void main(String[] args) {
        int arr[] = {4, 13, 8, -5, 9, 14, 13, 9};
//        Set<Integer> set1=new HashSet<>();
//        for (int uniq:arr) {
//            if(!set1.contains(uniq)){
//                set1.add(uniq);
//            }
//        }
//        System.out.println(set1);
//        List<Integer> list1 = new ArrayList<>();
//        for (int each : arr) {
//            list1.add(each);
//        }
//        System.out.println(list1);
//        Collections.sort(list1);
//        System.out.println(list1);

        String name = "Abdurrahman As";
        String[] newName = name.toLowerCase(Locale.ROOT).replace(" ", "").split("");
        List<String> listVowels = List.of("a","e","i","o","u");
        System.out.println(listVowels);

        Map<String, Integer> map1 = new HashMap<>();
        for (String each : newName) {
            if (listVowels.contains(each)) {
                if(map1.containsKey(each)){
                    map1.put(each, map1.get(each)+1);
                }else {
                    map1.put(each, 1);
                }
            }
        }
        System.out.println(map1);
    }
}


