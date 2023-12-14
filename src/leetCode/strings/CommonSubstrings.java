package leetCode.strings;

public class CommonSubstrings {
    public static void main(String[] args) {
        /*
        check if there is any common substring for two strings.
        return true if exists.
         */
        String s = "mapper";
        String t = "ctn";
        System.out.println(hasCommonSubstring(s,t));
    }
    public static boolean hasCommonSubstring(String s, String t){
        boolean[] check = new boolean[26];
        for (char c: t.toCharArray()) {
            check[c-'a']=true;
        }
        for (char ch: s.toCharArray()){
            if(check[ch-'a'])
                return true;
        }
        return false;
    }
}
