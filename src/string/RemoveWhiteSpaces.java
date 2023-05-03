package string;

public class RemoveWhiteSpaces {
    public static void main(String[] args) {
        String str= " Java Interview   Questions ";
        str=str.replaceAll("\\s","");
        System.out.println(str);
    }
}
