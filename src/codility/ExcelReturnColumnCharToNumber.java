package codility;

import java.util.HashMap;

public class ExcelReturnColumnCharToNumber {
    public static void main(String[] args) {
        String columnTitle = "ABC";
        System.out.println(titleToNumber(columnTitle));
        System.out.println(titleToNumber2(columnTitle));
    }
    public static int titleToNumber(String columnTitle) {
        char[] letters = columnTitle.toCharArray();
        int columnNum = 0;
        int right = letters.length-1;
        int left = 0;
        while(right>=0){
            columnNum += ((letters[right]-'A') +1) * Math.pow(26,left);
            right--;
            left++;
        }
        return columnNum;
    }
    public static int titleToNumber2(String colTitle){
        int colNum=0;
        int left=0;
        while(left<colTitle.length()){
            colNum = 26*colNum+(colTitle.charAt(left)-'A'+1);
            left++;
        }
        return colNum;
    }
}
