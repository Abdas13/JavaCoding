package hackerrank.strings;

import java.util.Scanner;

public class ReverseOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(str.contentEquals(reversedString(str))?"Yes":"No");
    }

    private static StringBuffer reversedString(String str) {

        StringBuffer modifiedStr = new StringBuffer();
        modifiedStr.append(str).reverse();
        return modifiedStr;
    }
}
