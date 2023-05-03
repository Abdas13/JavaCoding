package string;

import java.util.Locale;

public class CamelCase {
    public static void main(String[] args) {
        String sentence="Convert the sentence to camel case";
        String converted=convertedToCamel(sentence);
        System.out.println(converted);
    }

    private static String convertedToCamel(String sentence) {
        String[] words=sentence.split(" ");
        String newSentence="";

        for(int i=0; i< words.length;i++){
            String word=words[i];
             if(i==0){
                 newSentence+=word.toLowerCase();
             }else{
                 String firstLetter=word.substring(0,1).toUpperCase();
                 String restLetters=word.substring(1, word.length()).toLowerCase();
                 String newWord=firstLetter+restLetters;
                 newSentence+=newWord;
             }
        }
        return  newSentence;
    }
}
