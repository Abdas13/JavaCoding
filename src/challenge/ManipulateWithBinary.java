package challenge;

public class ManipulateWithBinary {
    public static void main(String[] args) {
        String str="karakalem";
        for(int i=0; i<str.length();i++){
            char letter=str.charAt(i);
            letter++;
            System.out.print(letter);
        }
    }
}
