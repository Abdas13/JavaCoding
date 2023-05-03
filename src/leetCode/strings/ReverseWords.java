package leetCode.strings;

public class ReverseWords {
    public static String reverseWords(String s){
//      input=  " the sky  is blue  "  output= "blue is sky the"
        char[] str=s.toCharArray();
        // 1st step: reverse entire string
        reverse(str, 0, str.length-1);
        // 2nd step: reverse each words
        reverseWordsSeperately(str);
        // 3rd step: clean spaces
        return cleanSpaces(str);
    }
    private static String cleanSpaces(char[] str) {
        int left=0;
        int right=0;
        while (right<str.length){
            while (right<str.length && str[right]==' ') right++;
            while (right<str.length && str[right]!=' '){
                str[left]=str[right];
                left++;
                right++;
            }
            while (right<str.length && str[right]==' ') right++;
            if(right<str.length){
                str[left]=' ';
                left++;
            }
        }
        return new String(str).substring(0,left);
    }

    private static void reverseWordsSeperately(char[] str) {
        int left=0;
        int right=0;
        while (left< str.length){
            while (left<str.length && str[left]==' ' ) left++;
            right=left;
            while (left< str.length && str[left]!=' ') right++;
            reverse(str,left,right-1);
            left=right;
        }
    }

    private static void reverse(char[] str, int left, int right) {
        while (left<right){
            char temp=str[left];
            str[left]=str[right];
            str[right]=temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        String s= " the sky  is blue  ";
        System.out.println(reverseWords(s));
    }
}
