package string;

public class ReverseString {
    public static void main(String[] args) {
        String kelime="merhaba";
        String word="Karakalem";
        String reverseOfWord="" ;

        for (int i = word.length()-1; i >=0 ; i--) {
            reverseOfWord=reverseOfWord+word.charAt(i);
        }
        System.out.println("reverse of Karakalem is: "+reverseOfWord);
        System.out.println(reverse(kelime));
    }
    public static String reverse(String givenString){
        String rvrs="";
        char[] letters=givenString.toCharArray();
        for (int i =letters.length-1; i >=0 ; i--) {
            rvrs=rvrs+letters[i];

        }
        return rvrs;

    }


}
