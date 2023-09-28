package collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordsLength {
    public static void main(String[] args) {
        String[] strs = {"a", "bb", "ccccc", "bb"};

        Map<String, Integer> result = wordsLen(strs);
        System.out.println(result);
    }

    private static Map<String, Integer> wordsLen(String[] strs) {

        Map<String, Integer> returnValue = new HashMap<>();

        for (String word:strs) {
            returnValue.put(word, word.length());
        }
        return returnValue;
    }
}
