package string;

public class NumOfOccurance {
    public static void main(String[] args) {
        String str= "Abdurrahman As Marmara";
        String s=str.toLowerCase();
//        System.out.println(s);
        int firstCount=s.length();
        int lastCount=s.replace("a","").length();
        int restCount=firstCount-lastCount;
        System.out.println("Number of ocurances of a is : "+restCount);
    }
}
