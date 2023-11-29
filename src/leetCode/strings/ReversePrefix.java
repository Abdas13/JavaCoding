package leetCode.strings;

public class ReversePrefix {
    public static void main(String[] args) {
        String s = "abcdef";
        char ch = 'd';
        System.out.println(reversePrefix(s,ch));
    }
    public static String reversePrefix(String word, char ch) {
        char[] c = word.toCharArray();
        int left = 0;
        for (int i = 0; i < c.length; i++) {
            if (c[i]==ch) {
                int right = i;
                while (left < right) {
                    char temp = c[left];
                    c[left] = c[right];
                    c[right] = temp;
                    left++;
                    right--;
                }
                break;
            }
        }
        return new String(c);
    }

}
