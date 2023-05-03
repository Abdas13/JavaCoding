package string;

import java.util.Arrays;

public class RemoveSymbols {
    public static void main(String[] args) {
        //How to remove junks in a String
        String word="boo #$23%@*ABF_&% %kgh";
      //  word=word.replaceAll("[^a-zA-Z0-9]","");
        word=word.replaceAll("\\W","");
        String word2=word.replaceAll("[^bB]", "");
        String word3=word.replaceAll("\\d","");
        String word4=word.replaceAll("[bB]","Z");
        String word5=word.replaceAll("[A-Z]","ben");
        System.out.println(word);
        System.out.println(word2);
        System.out.println(word3);
        System.out.println(word4);
        System.out.println(word5);
    }
}
