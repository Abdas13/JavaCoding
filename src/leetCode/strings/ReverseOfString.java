package leetCode.strings;

public class ReverseOfString {
    public static void reverseString(char[] s) {

        int left = 0;
        int right = s.length - 1;
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
        System.out.println(s);
    }
    public static void main(String[] args) {
        String str="aba";
        reverseString(str.toCharArray());
        reverseString("adam".toCharArray());
        reverseString("ey edip adanada pide ye".toCharArray());
        reverseString("12345".toCharArray());
    }
}
