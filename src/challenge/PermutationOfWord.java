package challenge;

public class PermutationOfWord {
    public static void main(String[] args) {
        String word="ABCD";
        printPermutation(word,"");
    }

    private static void printPermutation(String word, String s) {
        if (word.length()==0) {
            System.out.println(s+" ");
            return;
        }
        for (int i=0;i<word.length();i++){
            char letter=word.charAt(i);
            String restPart=word.substring(0,i)+word.substring(i+1);
            printPermutation(restPart,s+letter);
        }
    }
}
