package leetCode.collections;

public class RomanToInteger {
    static int[] table = new int[256];
    static {
        table['I']=1;
        table['V']=5;
        table['X']=10;
        table['L']=50;
        table['C']=100;
        table['D']=500;
        table['M']=1000;
    }
    public static void main(String[] args) {
        String str = "XXV";
        System.out.println(romanToInt(str));
    }
    public static int romanToInt(String str){
        int result = table[str.charAt(str.length()-1)];
        for (int i = str.length()-2; i>=0  ; i--) {
            if(table[str.charAt(i)] < table[str.charAt(i+1)]){
                result -= table[str.charAt(i)];
            }else {
                result += table[str.charAt(i)];
            }
        }
        return result;
    }
}
