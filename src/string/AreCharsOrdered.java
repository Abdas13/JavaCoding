package string;

public class AreCharsOrdered {

    public static void main(String[] args) {

        String str = "aabbbcccda";
        System.out.println(isOrdered(str));
        System.out.println(isInAlphabeticOrder(str));

    }

    public static boolean isOrdered(String str) {
        boolean isOrdered = true;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i - 1) > str.charAt(i)) {
                isOrdered = false;
                break;
            }
        }
        return isOrdered;
    }

    public static boolean isInAlphabeticOrder(String str) {

        int left = 0;
        for (int right = 1; right < str.length(); right++) {
            if(str.charAt(left)<=str.charAt(right)){
                left++;
                continue;
            }else
                return false;
        }
        return true;
    }
}
