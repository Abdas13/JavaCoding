package string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountWord {
    //AreCharsOrdered the number of words in the sentence
    public static void main(String[] args) {
        String sentence="Java is Java and it is not JavaScript. ";
        System.out.println(countWords(sentence));
    }
    public static Map<String,Integer> countWords(String sentence){

        String[] words = sentence.split(" ");
        Map<String,Integer> hm=new HashMap<>();

        for (String each:words) {
            if(!hm.containsKey(each)){
                hm.put(each,1);
            }else {
                hm.put(each,hm.get(each)+1);
            }
        }
        return hm;

    }
}
