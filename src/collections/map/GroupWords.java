package collections.map;


import java.util.*;
import java.util.regex.Pattern;

/*
Write a method that groups words in a sentence based on their number of occurrences
 */
public class GroupWords {
    public static void main(String[] args) {

        String input = "Hello, World! Hello, World! Hello, World Hello how, how, how, how about";
        String[] replaced = input.replaceAll("\\p{Punct}", "").split(" ");
        groupWords(input);

    }
    public static void groupWords(String sentence){
        String[] strArray = sentence.replaceAll("\\p{Punct}", "").split(" ");
        Map<String, Integer> hmap = new HashMap<>();

        for (String word:strArray) {
            hmap.put(word, hmap.getOrDefault(word,0)+1);
        }
        List<String> list =new ArrayList<>();

    }
}
