package leetCode.arrays;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String str= "we were getting and preparing our test";
        System.out.println(lengthOfLastWord(str));
    }
    public static int lengthOfLastWord(String str){
        int right = str.length()-1;

        int left=right;
        while (left>=0 && str.charAt(left)!=' '){
            left--;
        }
        return right-left;
    }
}
