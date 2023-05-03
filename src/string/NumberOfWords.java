package string;

import java.util.HashMap;

public class NumberOfWords {
    public static void main(String[] args) {
        String sentence="What are you doing? What time are you coming? What? ";
        sentence=sentence.replace("?","");
        System.out.println(sentence);

        String[] word=sentence.split(" ");

        HashMap<String, Integer> words=new HashMap<>();
        for (int i=0; i<word.length;i++){
            String newWord=word[i];
            if(words.containsKey(newWord)){
                int number=words.get(newWord);
                words.put(newWord,number+1);
            }else{
                words.put(newWord,1);
            }
        }
        System.out.println(words);


    }
}
