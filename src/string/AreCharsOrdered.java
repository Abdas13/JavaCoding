package string;

public class AreCharsOrdered {

    public static void main(String[] args) {

        String str="aabbb";
        System.out.println(isOrdered(str));

    }
    public static boolean isOrdered(String str){
        boolean isOrdered=true;
        for (int i = 1; i < str.length(); i++) {
            if(str.charAt(i-1)>str.charAt(i)){
                isOrdered=false;
                break;
            }
        }
        return isOrdered;
    }
}
