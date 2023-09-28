package collections.map;

import java.util.Arrays;
import java.util.HashMap;

public class NumOfWords {
    public static void main(String[] args) {
//        String sentence="Java looks a difficult language. Python is easier than Java. If you know Java you can handle Python. It is easier.";
//        String s=sentence.replace(".","");
//        System.out.println(s.toString());
//        String []words=s.split(" ");
//        System.out.println(Arrays.toString(words));
//        HashMap<String,Integer>numWords=new HashMap<>();
//        for (String w:words) {
//            if(!numWords.containsKey(w)){
//                numWords.put(w,1);
//            }else {
//                numWords.put(w, numWords.get(w)+1);
//            }
//        }
//        System.out.println(numWords.entrySet());



        String sentence="Java looks a difficult language. Python is easier than Java. If you know Java, you can handle Python. It is easier.";
        String sent=sentence.toLowerCase().replaceAll("[^a-z ]","");
//        String sent=sentence.toLowerCase().replace(".","").replace(",","");
//        System.out.println(sent);
        String[] words=sent.split(" ");
        HashMap<String,Integer>hm=new HashMap<>();
        for (String each:words) {
            if(!hm.containsKey(each)){
                hm.put(each,1);
            }else {
                hm.put(each,hm.get(each)+1);
            }
        }
        System.out.println(hm.entrySet());

    }
}
