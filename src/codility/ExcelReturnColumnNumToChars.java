package codility;

public class ExcelReturnColumnNumToChars {
    /*
    The column names start with A, B, C, and so on, then after 26th
    column AA, AB, AC,...
    Create a method to find column represents by letters if column number is given.
    Example : input id 28, output is AB
     */
    public static void main(String[] args) {
        System.out.println(findColumnByLetters(731));
        System.out.println(findColumnChars(28));

    }

    public static String findColumnByLetters(int n) {
        if (n <= 0) return "ERROR";
        char base = 'A';
        String letter = "";
        while (n > 0) {
            n--;
            letter = (char) ((n % 26) + base) + letter;
            n = n / 26;
        }
        return letter;
        }
        public static String findColumnChars(int n){
        char base = 'A';
        StringBuilder sb = new StringBuilder();
        while (n>0){
            n--;
            sb.insert(0,(char) (n%26 + base));
            n /= 26;
        }
        return sb.toString();
        }
}

